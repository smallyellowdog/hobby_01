package com.xuyi.designpattern.builder;

import com.xuyi.designpattern.builder.builder.impl.PCComputerBuilder;
import com.xuyi.designpattern.builder.director.ComputerDirector;
import com.xuyi.designpattern.builder.entity.Computer;

public class Main {
    public static void main(String[] args) {

        ComputerDirector computerDirector = new ComputerDirector();

        Computer computer = new Computer();

        computer = computerDirector.installComputer(computer, PCComputerBuilder.class);

        System.out.println(computer);
    }
}
