package com.ariverh.structural.adapter.interfaceadapter;

public class Target extends Adapter{
    @Override
    public void method1() {
        super.method1();
    }

    public void method3(){
        System.out.println("我是目标设备的其他接口");
    }
}
