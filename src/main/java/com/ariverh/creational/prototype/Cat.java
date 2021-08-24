package com.ariverh.creational.prototype;

public class Cat extends Animal{

    public Cat(){
        type = "cat";
    }
    @Override
    void shout() {
        System.out.println("i am a cat");
    }
}
