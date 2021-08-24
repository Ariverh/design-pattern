package com.ariverh.prototype;

public class Dog extends Animal{

    public Dog(){
        type = "dog";
    }


    @Override
    void shout() {
        System.out.println("i am a dog");
    }
}
