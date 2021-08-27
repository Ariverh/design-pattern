package com.ariverh.structural.flyweight;

public class Apple implements Fruit{

    private final String name = "Apple";

    @Override
    public String getFruitName() {
        return name;
    }
}
