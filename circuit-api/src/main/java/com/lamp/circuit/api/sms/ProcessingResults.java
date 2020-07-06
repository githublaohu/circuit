package com.lamp.circuit.api.sms;

public interface ProcessingResults {

    //拉取短信回复状态
    void smsReplyStatus();  
    
    // 拉取单个号码短信回复状态
    void smsReplyStatusByPhoneNumber();
    
    // 拉取短信下发状态
    void smsSendStatus();
    
    //拉取短信下发状态
    void smsSendStatusByPhoneNumber();
}
