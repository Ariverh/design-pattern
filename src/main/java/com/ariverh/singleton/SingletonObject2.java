package com.ariverh.singleton;

public class SingletonObject2 {
    private static SingletonObject2 instance = new SingletonObject2();

    private SingletonObject2(){}
    public static SingletonObject2 getInstance(){
        return instance;
    }
}
