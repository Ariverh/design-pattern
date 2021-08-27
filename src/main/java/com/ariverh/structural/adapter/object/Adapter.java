package com.ariverh.structural.adapter.object;

public class Adapter implements Target {

    private Source source;

    public Adapter(Source source){
        this.source = source;
    }

    @Override
    public void method1() {
        this.source.method1();
    }

    @Override
    public void method2() {
        System.out.println("我是目标设备的其他接口");
    }
}
