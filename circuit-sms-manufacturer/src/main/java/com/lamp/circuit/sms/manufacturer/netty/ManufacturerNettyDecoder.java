package com.lamp.circuit.sms.manufacturer.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class ManufacturerNettyDecoder extends LengthFieldBasedFrameDecoder {

    public ManufacturerNettyDecoder(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength);
       
    }

    @Override
    public Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        ByteBuf frame = null;
        try {
            frame = (ByteBuf) super.decode(ctx, in);
            if (null == frame) {
                return null;
            }
            return null;
        } catch (Exception e) {
        } finally {
            if (null != frame) {
                frame.release();
            }
        }

        return null;
    }
}
