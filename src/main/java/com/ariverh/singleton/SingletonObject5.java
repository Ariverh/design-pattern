package com.ariverh.singleton;

public class SingletonObject5 {
    private static class Singleton{
        public static final SingletonObject5 Instance = new SingletonObject5();
    }

    private SingletonObject5(){}
    public static SingletonObject5 getInstance(){
        return Singleton.Instance;
    }

}
