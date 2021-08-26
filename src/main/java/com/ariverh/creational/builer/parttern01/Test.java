package com.ariverh.creational.builer.parttern01;

public class Test {
    public static void main(String[] args) {
        House house = Director.buildHouse();
        System.out.println(house.toString());
    }
}
