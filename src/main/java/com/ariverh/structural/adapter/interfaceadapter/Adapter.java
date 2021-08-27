package com.ariverh.structural.adapter.interfaceadapter;

public abstract class Adapter implements Source{
    @Override
    public void method1() {
        System.out.println("我是源设备的Type-c接口：输出");
    }

    @Override
    public void method2() {
        System.out.println("我是源设备的其他接口");
    }
}
