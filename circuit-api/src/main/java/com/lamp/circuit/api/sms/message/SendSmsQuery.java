/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.lamp.circuit.api.sms.message;

import java.util.Date;

/**
 * @author ouyangzhaobing
 * @version : SendSmsQuery.java,v 0.1 2020年07月17日 1:15 上午
 */
public class SendSmsQuery extends BaseQuery {

    private String phoneNo;

    private Date sendDate;

    private String bizId;
}