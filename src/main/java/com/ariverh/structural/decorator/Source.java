package com.ariverh.structural.decorator;

public class Source implements SourceAble{
    @Override
    public void method1() {
        System.out.println("需被装饰源");
    }
}
