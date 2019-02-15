package com.xuyi.designpattern.builder.director;

import com.xuyi.designpattern.builder.builder.ComputerBuilder;
import com.xuyi.designpattern.builder.entity.Computer;

/**
 * 调用具体建造者来创建复杂对象的各个部分
 */
public class ComputerDirector {

    public Computer installComputer(Computer computer, Class c){

        ComputerBuilder computerBuilder = null;
        try {
             computerBuilder = (ComputerBuilder)c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        computerBuilder.installMainBoard(computer)
                .installCpu(computer)
                .installGraphicsCard(computer)
                .givenName(computer)
                .confirmPrice(computer);

        return computer;
    }
}
