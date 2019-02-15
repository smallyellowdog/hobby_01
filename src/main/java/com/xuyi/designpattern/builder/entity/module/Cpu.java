package com.xuyi.designpattern.builder.entity.module;

import com.xuyi.designpattern.builder.entity.base.BaseItem;
import lombok.Data;

/**
 * CPU
 */
@Data
public class Cpu extends BaseItem {
    /**
     * 转速
     */
    private int speed;
}
