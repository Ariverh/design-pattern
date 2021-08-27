package com.ariverh.structural.bridge;

public class MyBridge extends Bridge{

    public MyBridge(SourceAble source) {
        super(source);
    }

    @Override
    public void method() {
        getSource().method();
    }

}
