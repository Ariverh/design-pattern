package com.ariverh.creational.builer.pattern02;

public class Test {
    public static void main(String[] args) {
        Builder builder = new Worker()
                .buildSize(100)
                .buildNumber(5)
                .buildStep1("建造地基")
                .buildStep2("砌墙")
                .buildStep3("完工");
        House house = builder.build();
        System.out.println(house.toString());
    }
}
