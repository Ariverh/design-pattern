package com.ariverh.creational.abstractFactory.produce.impl;

import com.ariverh.creational.abstractFactory.produce.Phone;

public class XiaoMiPhone implements Phone {
    @Override
    public void makePhone() {
        System.out.println("make xiaomi phone!");
    }
}
