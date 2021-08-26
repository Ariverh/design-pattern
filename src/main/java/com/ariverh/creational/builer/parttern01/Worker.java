package com.ariverh.creational.builer.parttern01;

import java.sql.SQLOutput;

public class Worker extends Builder{

    private House house;

    public Worker() {
        this.house = new House();
    }

    @Override
    public void buildSize(Integer size) {
        System.out.println("指定建造面积");
        house.setSize(size);
    }

    @Override
    public void buildNumber(Integer number) {
        System.out.println("指定建造层数");
        house.setNumber(number);
    }

    @Override
    public void buildStep1(String step) {
        System.out.println("开始建造，建造地基");
        house.setStep1(step);
    }

    @Override
    public void buildStep2(String step) {
        System.out.println("砌墙");
        house.setStep2(step);
    }

    @Override
    public void buildStep3(String step) {
        System.out.println("完工");
        house.setStep3(step);
    }

    public House build(){
        return this.house;
    }
}
