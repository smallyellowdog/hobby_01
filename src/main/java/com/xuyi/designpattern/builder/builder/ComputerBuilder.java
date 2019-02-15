package com.xuyi.designpattern.builder.builder;

import com.xuyi.designpattern.builder.builder.impl.PCComputerBuilder;
import com.xuyi.designpattern.builder.entity.Computer;

public interface ComputerBuilder {
    //安装主板
    PCComputerBuilder installMainBoard(Computer computer);
    //安装CPU
    PCComputerBuilder installCpu(Computer computer);
    //安装显卡
    PCComputerBuilder installGraphicsCard(Computer computer);
    //安装硬盘
    //安装内存条
    //安装机箱
    //安装屏幕...

    //命名
    PCComputerBuilder givenName(Computer computer);
    //定价
    PCComputerBuilder confirmPrice(Computer computer);
}
