package com.lamp.circuit.api.sms;

public interface SmsTemplate {

    
    // 添加模板
    void AddSmsTemplate();
    
    // 删除模板
    void DeleteSmsTemplate();
    
    // 短信模板状态查询
    void describeSmsTemplateList();
    
    // 修改短信模板
    void modifySmsTemplate();
}
