package com.ariverh.structural.facade;

public class Cpu implements ExecutedAble{

    @Override
    public void execute() {
        System.out.println("使用cpu");
    }
}
