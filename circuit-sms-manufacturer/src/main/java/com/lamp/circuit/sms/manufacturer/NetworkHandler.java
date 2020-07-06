package com.lamp.circuit.sms.manufacturer;

import java.net.SocketAddress;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;

public interface NetworkHandler {
    
    public void connect(ChannelHandlerContext ctx, SocketAddress remoteAddress, SocketAddress localAddress, ChannelPromise promise);

    public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise) ;

    public void close(ChannelHandlerContext ctx, ChannelPromise promise) ;

    public void heartbeat(ChannelHandlerContext ctx, Object evt);

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause);
}
