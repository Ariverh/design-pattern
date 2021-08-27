package com.ariverh.structural.decorator;

public class Decorator implements SourceAble{

    private SourceAble source;

    public Decorator(Source source){
        this.source = source;
    }

    @Override
    public void method1() {
        System.out.println("=============开始装饰============");
        this.source.method1();
        System.out.println("装饰中....");
        System.out.println("=============装饰完成============");
    }
}
