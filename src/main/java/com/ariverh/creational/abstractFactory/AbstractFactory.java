package com.ariverh.creational.abstractFactory;

import com.ariverh.creational.abstractFactory.produce.Pad;
import com.ariverh.creational.abstractFactory.produce.Phone;

public abstract class AbstractFactory{
    abstract Phone getPhone(String type);
    abstract Pad getPad(String type);
}
