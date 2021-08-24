package com.ariverh.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonObject1 instance = SingletonObject1.getInstance();
        SingletonObject2 instance1 = SingletonObject2.getInstance();
        SingletonObject3 instance2 = SingletonObject3.getInstance();
        SingletonObject4 instance3 = SingletonObject4.getInstance();
        SingletonObject5 instance4 = SingletonObject5.getInstance();
    }
}
