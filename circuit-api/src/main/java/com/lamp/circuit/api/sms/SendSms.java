package com.lamp.circuit.api.sms;

import com.lamp.circuit.api.sms.message.SendSmsDetail;
import com.lamp.circuit.api.sms.message.SendSmsQuery;
import com.lamp.circuit.api.sms.message.SendSmsRequest;
import com.lamp.circuit.api.sms.message.SendSmsResponse;

import java.util.List;

public interface SendSms {
    
    SendSmsResponse sendSms(SendSmsRequest sendSmsRequest );

    SendSmsResponse sendBatchSms(List<SendSmsRequest> sendSmsRequestList);

    SendSmsDetail querySendDetails(SendSmsQuery sendSmsQuery);
}
