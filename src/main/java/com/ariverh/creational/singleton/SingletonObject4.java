package com.ariverh.creational.singleton;

public class SingletonObject4 {
    private volatile static SingletonObject4 instance;
    private SingletonObject4(){}
    public static SingletonObject4 getInstance(){
        if (instance == null){
            synchronized (SingletonObject4.class){
                if (instance == null){
                    instance = new SingletonObject4();
                }
            }
        }
        return instance;
    }
}
