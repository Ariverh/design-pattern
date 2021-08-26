package com.ariverh.creational.builer.pattern02;

public class Worker extends Builder {

    private House house;

    public Worker() {
        this.house = new House();
    }

    @Override
    public Builder buildSize(Integer size) {
        System.out.println("指定建造面积");
        house.setSize(size);
        return this;
    }

    @Override
    public Builder buildNumber(Integer number) {
        System.out.println("指定建造层数");
        house.setNumber(number);
        return this;
    }

    @Override
    public Builder buildStep1(String step) {
        System.out.println("开始建造，建造地基");
        house.setStep1(step);
        return this;
    }

    @Override
    public Builder buildStep2(String step) {
        System.out.println("砌墙");
        house.setStep2(step);
        return this;
    }

    @Override
    public Builder buildStep3(String step) {
        System.out.println("完工");
        house.setStep3(step);
        return this;
    }

    public House build(){
        return this.house;
    }
}
