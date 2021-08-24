package com.ariverh.creational.prototype;

public class Test {

    public static void main(String[] args) {
        AnimalCache.loadData();

        Animal animal = AnimalCache.getAnimal(1L);
        animal.shout();
        Animal animal1 = AnimalCache.getAnimal(2L);
        animal1.shout();
        Animal animal2 = AnimalCache.getAnimal(3L);
        animal2.shout();
    }
}
