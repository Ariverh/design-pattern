package com.ariverh.structural.flyweight;

public class Test {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.getFruit("Apple");
        Fruit banana = fruitFactory.getFruit("Banana");
        Fruit orange = fruitFactory.getFruit("Orange");
        System.out.println(apple.hashCode());
        System.out.println(banana.hashCode());
        System.out.println(orange.hashCode());

        Fruit apple1 = fruitFactory.getFruit("Apple");
        Fruit banana1 = fruitFactory.getFruit("Banana");
        Fruit orange1 = fruitFactory.getFruit("Orange");
        System.out.println(apple1.hashCode());
        System.out.println(banana1.hashCode());
        System.out.println(orange1.hashCode());
    }
}
