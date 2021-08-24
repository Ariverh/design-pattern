package com.ariverh.creational.abstractFactory;

import com.ariverh.creational.abstractFactory.produce.Pad;
import com.ariverh.creational.abstractFactory.produce.Phone;

public class Test {
    public static void main(String[] args) {
        System.out.println("=============PhoneFactory==============");
        AbstractFactory phoneFactory = Producer.getFactory("phone");
        Phone xiaomiPhone = phoneFactory.getPhone("xiaomi");
        xiaomiPhone.makePhone();

        Phone huaweiPhone = phoneFactory.getPhone("huawei");
        huaweiPhone.makePhone();

        Phone iphone = phoneFactory.getPhone("apple");
        iphone.makePhone();
        System.out.println("=============PadFactory==============");
        AbstractFactory padFactory = Producer.getFactory("pad");
        Pad xiaomiPad = padFactory.getPad("xiaomi");
        xiaomiPad.makePad();

        Pad huaweiPad = padFactory.getPad("huawei");
        huaweiPad.makePad();

        Pad iPad = padFactory.getPad("apple");
        iPad.makePad();
    }
}
