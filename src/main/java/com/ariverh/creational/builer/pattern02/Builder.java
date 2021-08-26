package com.ariverh.creational.builer.pattern02;

public abstract class Builder {
    public abstract Builder buildSize(Integer size);
    public abstract Builder buildNumber(Integer number);
    public abstract Builder buildStep1(String step);
    public abstract Builder buildStep2(String step);
    public abstract Builder buildStep3(String step);
    public abstract House build();
}
