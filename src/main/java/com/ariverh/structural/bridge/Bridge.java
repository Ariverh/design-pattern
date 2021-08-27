package com.ariverh.structural.bridge;

public abstract class Bridge {
    private SourceAble source;

    public Bridge(SourceAble source){
        this.source = source;
    }

    public abstract void method();

    public SourceAble getSource(){
        return source;
    }

    public void setSource(SourceAble source){
        this.source = source;
    }
}
