package com.lamp.circuit.sms.manufacturer.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

// 要不这个方法
public class ManufacturerNettyEncoder extends MessageToByteEncoder<Object>{

    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
        // TODO Auto-generated method stub
    }

}
