package com.lamp.circuit.api.sms;

public interface SmsSign {

    
    //调用接口ModifySmsSign修改未审核通过的短信签名，并重新提交审核。
    void addSmsSign();
    
    //调用接口ModifySmsSign修改未审核通过的短信签名，并重新提交审核。
    void dleteSmsSign();
    
    //调用接口ModifySmsSign修改未审核通过的短信签名，并重新提交审核。
    void querySmsSign();
    
    //调用接口ModifySmsSign修改未审核通过的短信签名，并重新提交审核。
    void ModifySmsSign();   
}
