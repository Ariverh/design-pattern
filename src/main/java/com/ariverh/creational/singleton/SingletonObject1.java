package com.ariverh.creational.singleton;

public class SingletonObject1 {

    private static SingletonObject1 instance;

    private SingletonObject1(){}
    public static SingletonObject1 getInstance(){
        if (instance == null){
            instance = new SingletonObject1();
        }
        return instance;
    }
}
