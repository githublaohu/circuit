package com.lamp.circuit.api.sms;

import com.lamp.circuit.api.sms.message.SendSmsRequest;

public interface SendSms {

    
    void sendSms(SendSmsRequest sendSmsRequest );
    
    void sendBatchSms();
    
    void querySendDetails();
}
