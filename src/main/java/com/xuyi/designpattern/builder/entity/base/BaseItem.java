package com.xuyi.designpattern.builder.entity.base;

import lombok.Data;

@Data
public abstract class BaseItem {

    /**
     * id
     */
    private int id;

    /**
     * 名称
     */
    public String name;

    /**
     * 价格
     */
    public double price;
}
