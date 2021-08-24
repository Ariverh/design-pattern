package com.ariverh.creational.prototype;

public class Fish extends Animal{
    public Fish(){
        type = "fish";
    }

    @Override
    void shout() {
        System.out.println("i am a fish");
    }
}
