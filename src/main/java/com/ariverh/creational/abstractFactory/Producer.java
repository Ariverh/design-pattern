package com.ariverh.creational.abstractFactory;

public class Producer {
    public static AbstractFactory getFactory(String type){
        if (type.equals("phone")){
            return new PhoneFactory();
        }else if (type.equals("pad")){
            return new PadFactory();
        }else {
            return null;
        }
    }
}
