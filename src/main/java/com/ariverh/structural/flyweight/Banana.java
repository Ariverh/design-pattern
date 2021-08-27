package com.ariverh.structural.flyweight;

public class Banana implements Fruit{

    private final String name = "Banana";

    @Override
    public String getFruitName() {
        return name;
    }
}
