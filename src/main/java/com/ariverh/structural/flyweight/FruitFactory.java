package com.ariverh.structural.flyweight;

import java.util.HashMap;

public class FruitFactory {
    private HashMap<String,Fruit> fruits = new HashMap<>();

    public Fruit getFruit(String name){
        if (fruits.get(name) != null)
            return fruits.get(name);
        if (name.equals("Apple")){
            Apple apple = new Apple();
            fruits.put(apple.getFruitName(),apple);
            return apple;
        }else if (name.equals("Orange")){
            Orange orange = new Orange();
            fruits.put(orange.getFruitName(),orange);
            return orange;
        }else if (name.equals("Banana")){
            Banana banana = new Banana();
            fruits.put(banana.getFruitName(),banana);
            return banana;
        }else {
            return null;
        }
    }
}
