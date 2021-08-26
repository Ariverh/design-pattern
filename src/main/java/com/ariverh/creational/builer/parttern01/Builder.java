package com.ariverh.creational.builer.parttern01;

public abstract class Builder {
    public abstract void buildSize(Integer size);
    public abstract void buildNumber(Integer number);
    public abstract void buildStep1(String step);
    public abstract void buildStep2(String step);
    public abstract void buildStep3(String step);
    public abstract House build();
}
