package com.ariverh.structural.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        System.out.println("=========源设备Type-c接口与目标设备接口苹果适配中=========");
        adapter.method1();
        System.out.println("目标设备苹果接口：接收");
        System.out.println("=========源设备Type-c接口与目标设备接口苹果适配成功=========");
        adapter.method2();
    }
}
