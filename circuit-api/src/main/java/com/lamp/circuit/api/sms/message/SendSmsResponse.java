/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.lamp.circuit.api.sms.message;

/**
 * @author ouyangzhaobing
 * @version : SnedSmsResponse.java,v 0.1 2020年07月17日 12:43 上午
 */
public class SendSmsResponse {

    /**
     * 回执id,可以用来获取盖茨发送的详细信息如发送状态等
     */
    private String bizId;

    /**
     * 请求状态码
     * 返回OK代表请求成功
     * 其他错误码详见错误码列表
     */
    private String code;

    /**
     * 状态码的描述
     */
    private String message;

    /**
     * 请求ID
     */
    private String requestId;
}