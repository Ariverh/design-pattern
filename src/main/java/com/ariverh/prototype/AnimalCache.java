package com.ariverh.prototype;

import java.util.HashMap;

public class AnimalCache {
    private static HashMap<Long,Animal> animalCache = new HashMap<>();

    public static Animal getAnimal(Long id){
        return (Animal) (animalCache.get(id).clone());
    }

    public static void loadData(){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        cat.setId(1L);
        dog.setId(2L);
        fish.setId(3L);

        animalCache.put(cat.getId(), cat);
        animalCache.put(dog.getId(), dog);
        animalCache.put(fish.getId(), fish);
    }
}
