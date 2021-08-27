package com.ariverh.structural.proxy;

public class ProxyPerson implements SellHouseAble{

    private HouseHost houseHost;

    public ProxyPerson(){
        this.houseHost = new HouseHost();
    }


    @Override
    public void sellHouse() {

        System.out.println("找想要买房子的人");
        System.out.println("谈价格");
        this.houseHost.sellHouse();
        System.out.println("房子已卖出");

    }
}
