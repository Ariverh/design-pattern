package com.ariverh.structural.adapter.interfaceadapter;

public class Test {
    public static void main(String[] args) {
        Target target = new Target();
        System.out.println("=========源设备Type-c接口与目标设备接口苹果适配中=========");
        target.method1();
        System.out.println("目标设备的被适配苹果接口: 接收");
        System.out.println("=========源设备Type-c接口与目标设备接口苹果适配成功=========");
        target.method3();
    }
}
