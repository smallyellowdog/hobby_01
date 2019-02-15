package com.xuyi.designpattern.builder.entity;

import com.google.common.collect.Lists;
import com.xuyi.designpattern.builder.entity.base.BaseItem;
import lombok.Data;

import java.util.List;

@Data
public class Computer extends BaseItem {
    private List<BaseItem> items = Lists.newArrayList();
}
