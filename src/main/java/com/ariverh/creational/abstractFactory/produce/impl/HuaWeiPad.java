package com.ariverh.creational.abstractFactory.produce.impl;

import com.ariverh.creational.abstractFactory.produce.Pad;

public class HuaWeiPad implements Pad {
    @Override
    public void makePad() {
        System.out.println("make huawei pad!");
    }
}
