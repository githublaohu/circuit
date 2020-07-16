/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.lamp.circuit.api.sms.message;

import java.util.Date;

/**
 * @author ouyangzhaobing
 * @version : SendSmsDetail.java,v 0.1 2020年07月17日 1:17 上午
 */
public class SendSmsDetail {

    private String code;

    private String message;

    private String requestId;

    /**
     * 发送总数
     */
    private Long totalCount;

    private String templateId;

    /**
     * 短信发送状态，包括：
     * 1：等待回执。
     * 2：发送失败。
     * 3：发送成功。
     */
    private int status;

    private Date sendDate;

    private Date receiveDate;

    private String phoneNo;

    private String content;

    /**
     * 拓展字段
     */
    private String outId;

    /**
     * 运营商短信状态码。
     * 短信发送成功：DELIVERED。
     * 短信发送失败：失败错误码请参考错误码文档。
     */
    private String errorCode;
}