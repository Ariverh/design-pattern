package com.ariverh.creational.factory;

public class Test {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone xiaomi = phoneFactory.getPhone(PhoneFactory.PhoneType.XIAOMI);
        Phone huawei = phoneFactory.getPhone(PhoneFactory.PhoneType.HUAWEI);
        Phone apple = phoneFactory.getPhone(PhoneFactory.PhoneType.APPLE);
        xiaomi.make();
        huawei.make();
        apple.make();
    }
}
