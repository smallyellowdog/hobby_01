package com.xuyi.designpattern.builder.builder.impl;

import com.xuyi.designpattern.builder.builder.ComputerBuilder;
import com.xuyi.designpattern.builder.entity.Computer;
import com.xuyi.designpattern.builder.entity.module.Cpu;
import com.xuyi.designpattern.builder.entity.module.GraphicsCard;
import com.xuyi.designpattern.builder.entity.module.Mainboard;

/**
 *台式机主机安装
 */
public class PCComputerBuilder implements ComputerBuilder {

    @Override
    public PCComputerBuilder installMainBoard(Computer computer) {

        Mainboard mainboard = new Mainboard();

        mainboard.setName("技嘉750大板");
        mainboard.setPrice(1005);
        mainboard.setType(1);

        computer.getItems().add(mainboard);

        return this;
    }

    @Override
    public PCComputerBuilder installCpu(Computer computer) {

        Cpu cpu = new Cpu();
        cpu.setName("英特尔i7-8700");
        cpu.setPrice(3000);
        cpu.setSpeed(5000);

        computer.getItems().add(cpu);

        return this;
    }

    @Override
    public PCComputerBuilder installGraphicsCard(Computer computer) {

        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setName("七彩虹1080Ti战斧");
        graphicsCard.setType(5);
        graphicsCard.setRoom(11);
        graphicsCard.setPrice(3900);

        computer.getItems().add(graphicsCard);

        return this;
    }

    @Override
    public PCComputerBuilder givenName(Computer computer) {

        computer.setName("惠普暗影精灵15");

        return this;
    }

    @Override
    public PCComputerBuilder confirmPrice(Computer computer) {
        /**
         * 定价也可以自己做一些策略，如Cpu打八折等
         */
        computer.getItems().forEach(baseItem -> {
            computer.setPrice(computer.getPrice()+baseItem.getPrice());
        });

        return this;
    }
}
