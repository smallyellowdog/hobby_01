package com.xuyi.designpattern.builder.entity.module;

import com.xuyi.designpattern.builder.entity.base.BaseItem;
import lombok.Data;

/**
 * 主板
 */
@Data
public class Mainboard extends BaseItem {
    /**
     * 主板类型，大板还是紧凑
     */
    private int type;

}
