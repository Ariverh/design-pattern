package com.ariverh.creational.abstractFactory.produce.impl;

import com.ariverh.creational.abstractFactory.produce.Pad;

public class XIaoMiPad implements Pad {
    @Override
    public void makePad() {
        System.out.println("make xiaomi Pad!");
    }
}
