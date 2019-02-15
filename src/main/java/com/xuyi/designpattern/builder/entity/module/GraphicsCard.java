package com.xuyi.designpattern.builder.entity.module;

import com.xuyi.designpattern.builder.entity.base.BaseItem;
import lombok.Data;

@Data
public class GraphicsCard extends BaseItem {
    /**
     * 类型 ex：1080Ti
     */
    private int type;

    /**
     * 容量 ex: 11g
     */
    private int room;
}
