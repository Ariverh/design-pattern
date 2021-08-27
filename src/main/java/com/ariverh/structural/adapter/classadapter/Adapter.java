package com.ariverh.structural.adapter.classadapter;

public class Adapter extends Source implements Target{
    @Override
    public void method2() {
        System.out.println("我是目标接口的其他接口");
    }
}
