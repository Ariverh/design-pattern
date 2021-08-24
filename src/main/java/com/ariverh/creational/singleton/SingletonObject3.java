package com.ariverh.creational.singleton;

public class SingletonObject3 {
    private static SingletonObject3 instance;

    private SingletonObject3(){}
    public static synchronized SingletonObject3 getInstance() {
        if (instance == null){
            instance = new SingletonObject3();
        }
        return instance;
    }
}
