/*
* frxs Inc.  湖南兴盛优选电子商务有限公司.
* Copyright (c) 2017-2019. All Rights Reserved.
*/
package com.lamp.circuit.sms.manufacturer.agreement;

public interface Agreement {

    // 在netty handler 连接成功调用
    void connent();
    
    // 在netty handler 心跳
    void heartbeat();
    
    // 下面都在netty handler 写入方法
    void closeConnect();
    
    void sendSms();
    
    void querySms();
    
    void deleteSms();
}
