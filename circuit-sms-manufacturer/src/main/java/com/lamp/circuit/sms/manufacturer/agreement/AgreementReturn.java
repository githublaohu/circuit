package com.lamp.circuit.sms.manufacturer.agreement;

import com.lamp.circuit.sms.manufacturer.agreement.message.CloseConnectResponse;
import com.lamp.circuit.sms.manufacturer.agreement.message.ConnentResponse;
import com.lamp.circuit.sms.manufacturer.agreement.message.DeleteSmsResponse;
import com.lamp.circuit.sms.manufacturer.agreement.message.HeartbeatResponse;
import com.lamp.circuit.sms.manufacturer.agreement.message.QuerySmsResponse;

public interface AgreementReturn {

    // 在netty handler 连接成功调用
    void connent(ConnentResponse connentResponse);
    
    // 在netty handler 心跳
    void heartbeat(HeartbeatResponse heartbeatResponse);
    
    // 下面都在netty handler 写入方法
    void closeConnect(CloseConnectResponse closeConnectResponse);
    
    void sendSms();
    
    void querySms(QuerySmsResponse querySmsResponse);
    
    void deleteSms(DeleteSmsResponse deleteSmsResponse);
}
