/*
* frxs Inc.  湖南兴盛优选电子商务有限公司.
* Copyright (c) 2017-2019. All Rights Reserved.
*/
package com.lamp.circuit.sms.manufacturer.netty;

import java.net.SocketAddress;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import com.lamp.circuit.sms.manufacturer.NetworkHandler;
import com.lamp.circuit.sms.manufacturer.agreement.AgreementManage;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.concurrent.DefaultEventExecutorGroup;

public class NettyClient {

    private final Bootstrap bootstrap = new Bootstrap();
    private final EventLoopGroup eventLoopGroupWorker;
    private final ConcurrentMap<String /* addr */, ChannelWrapper> channelTables = new ConcurrentHashMap<String, ChannelWrapper>();
    private DefaultEventExecutorGroup defaultEventExecutorGroup;
    
    private AgreementManage agreementManage;
    
    public NettyClient(AgreementManage agreementManage) {
        this.agreementManage = agreementManage;
    }
    
    public void start() {
        this.defaultEventExecutorGroup = new DefaultEventExecutorGroup(
            nettyClientConfig.getClientWorkerThreads(),
            new ThreadFactory() {

                private AtomicInteger threadIndex = new AtomicInteger(0);

                @Override
                public Thread newThread(Runnable connect(ChannelHandlerContext ctx, SocketAddress remoteAddress, SocketAddress localAddressr) {
                    return new Thread(r, "NettyClientWorkerThread_" + this.threadIndex.incrementAndGet());
                }
            });

        Bootstrap handler = this.bootstrap.group(this.eventLoopGroupWorker).channel(NioSocketChannel.class)
            .option(ChannelOption.TCP_NODELAY, true)
            .option(ChannelOption.SO_KEEPALIVE, false)
            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, nettyClientConfig.getConnectTimeoutMillis())
            .option(ChannelOption.SO_SNDBUF, nettyClientConfig.getClientSocketSndBufSize())
            .option(ChannelOption.SO_RCVBUF, nettyClientConfig.getClientSocketRcvBufSize())
            .handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    ChannelPipeline pipeline = ch.pipeline();
                    agreementManage.getAgreementWrapper(ch.remoteAddress());
                    pipeline.addLast(
                        defaultEventExecutorGroup,
                        new ManufacturerNettyDecoder(0, 0, 0),
                        new ManufacturerNettyEncoder(),
                        new IdleStateHandler(0, 0, nettyClientConfig.getClientChannelMaxIdleTimeSeconds()),
                        new ManufacetNettyConnectManageHandler(),
                        new ManufacetNettyClientHandler());
                }
            });
       
    }
    
    class ManufacetNettyClientHandler extends SimpleChannelInboundHandler<Object> {

        @Override
        protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
            processMessageReceived(ctx, msg);
        }
    }
    
    class ManufacetNettyConnectManageHandler extends ChannelDuplexHandler {
        
        private NetworkHandler networkHandler;
        
        @Override
        public void connect(ChannelHandlerContext ctx, SocketAddress remoteAddress, SocketAddress localAddress, ChannelPromise promise) throws Exception {
            // 立马发送连接命令
            // 拦截器处理连接成功
        }

        @Override
        public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
            // 调用连接disconect业务
        }

        @Override
        public void close(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
            //调用连接关闭的业务
        }

        @Override
        public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
            // 读写心跳，触发立马发送心跳
            
           
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
            // 调用连接器网络异常的方法
        }
    }
}
