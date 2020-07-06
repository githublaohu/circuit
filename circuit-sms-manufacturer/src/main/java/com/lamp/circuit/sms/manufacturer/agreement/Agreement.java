package com.lamp.circuit.sms.manufacturer.agreement;

import com.lamp.circuit.sms.manufacturer.agreement.message.CloseConnectRequest;
import com.lamp.circuit.sms.manufacturer.agreement.message.CloseConnectResponse;
import com.lamp.circuit.sms.manufacturer.agreement.message.ConnentRequest;
import com.lamp.circuit.sms.manufacturer.agreement.message.ConnentResponse;
import com.lamp.circuit.sms.manufacturer.agreement.message.DeleteSmsRequest;
import com.lamp.circuit.sms.manufacturer.agreement.message.DeleteSmsResponse;
import com.lamp.circuit.sms.manufacturer.agreement.message.HeartbeatRequest;
import com.lamp.circuit.sms.manufacturer.agreement.message.HeartbeatResponse;
import com.lamp.circuit.sms.manufacturer.agreement.message.QuerySmsRequest;
import com.lamp.circuit.sms.manufacturer.agreement.message.QuerySmsResponse;

public interface Agreement {

    // 在netty handler 连接成功调用
    ConnentResponse connent(ConnentRequest connentRequest );
    
    // 在netty handler 心跳
    HeartbeatResponse heartbeat(HeartbeatRequest heartbeatRequest);
    
    // 下面都在netty handler 写入方法
    CloseConnectResponse closeConnect(CloseConnectRequest closeConnectRequest);
    
    void sendSms();
    
    QuerySmsResponse querySms(QuerySmsRequest querySmsRequest);
    
    DeleteSmsResponse deleteSms(DeleteSmsRequest deleteSmsRequest  );
}
