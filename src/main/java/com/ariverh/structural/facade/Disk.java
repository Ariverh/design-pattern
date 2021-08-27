package com.ariverh.structural.facade;

public class Disk implements ExecutedAble{

    @Override
    public void execute() {
        System.out.println("使用磁盘");
    }
}
