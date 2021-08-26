package com.ariverh.creational.builer.parttern01;

public class Director {
    public static House buildHouse(){
        Builder builder = new Worker();
        builder.buildSize(100);
        builder.buildNumber(4);
        builder.buildStep1("建造地基");
        builder.buildStep2("砌墙");
        builder.buildStep3("完工");
        return builder.build();
    }
}
