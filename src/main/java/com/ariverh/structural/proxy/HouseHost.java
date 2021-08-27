package com.ariverh.structural.proxy;

public class HouseHost implements SellHouseAble{
    @Override
    public void sellHouse() {
        System.out.println("买房子");
    }
}
