package com.lamp.circuit.api;

public class Information {

    private String team;
    
    private String business;
    
    // sms, push , 邮件
    private String informationType;
    
    // 阿里云，等等
    private String informationChannel;
    
    
    // 使用那个配置
    private String channelName;
    
    
    //接收者
    private String recipient;
    
    //模板id, 从
    private String templateId;
    
    // 数据，短信数据一般就一个对象就行了。通过拦截器读取模板，进行处理
    private Object data; 
    
    private String sendTime;
}
