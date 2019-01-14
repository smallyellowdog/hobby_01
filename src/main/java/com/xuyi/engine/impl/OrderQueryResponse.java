package com.xuyi.engine.impl;

import lombok.Data;

import java.util.Date;
@Data
public class OrderQueryResponse {
    private long orderId;

    private long summary;

    private String userId;

    private String supperId;

    private double money;

    private Date createTime;
}
