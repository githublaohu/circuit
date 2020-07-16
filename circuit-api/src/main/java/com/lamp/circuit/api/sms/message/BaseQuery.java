/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.lamp.circuit.api.sms.message;

/**
 * @author ouyangzhaobing
 * @version : BaseQuery.java,v 0.1 2020年07月17日 1:13 上午
 */
public class BaseQuery {
    private Long pageNo = 1L;

    private Long pageSize = 10L;

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageNo() {
        return pageNo;
    }

    public Long getPageSize() {
        return pageSize;
    }
}