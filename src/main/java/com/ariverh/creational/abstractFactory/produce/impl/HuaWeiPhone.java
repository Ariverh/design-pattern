package com.ariverh.creational.abstractFactory.produce.impl;

import com.ariverh.creational.abstractFactory.produce.Phone;

public class HuaWeiPhone implements Phone {
    @Override
    public void makePhone() {
        System.out.println("make huawei phone!");
    }
}
