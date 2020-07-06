/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.lamp.circuit.api.sms.domain;

/**
 * @author ouyangzhaobing
 * @version : SmsRequest.java,v 0.1 2020年07月07日 12:10 上午
 */
public class SmsRequest {

    /**
     * 短信签名内容，使用 UTF-8 编码，必须填写已审核通过的签名
     * 阿里云必填腾讯云选填
     */
    private String signName;

    /**
     * 接收的电话号码
     */
    private String[] phoneNos;

    /**
     * 短信模版编码
     */
    private String templateCode;

    /**
     * 主账号AccessKey的ID
     */
    private String accessKeyId;

    /**
     * 短信模版对应的实际值,json格式
     * 腾讯云是由数组对应模版的变量占位符，阿里云是json串如:{"code":"56900"}
     */
    private String[] templateParam;

}