package com.ariverh.structural.adapter.object;

public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Target adapter = new Adapter(source);
        System.out.println("=========源设备Type-c接口与目标设备接口苹果适配中=========");
        adapter.method1();
        System.out.println("目标设备被适配苹果接口：接收");
        System.out.println("=========源设备Type-c接口与目标设备接口苹果适配成功=========");
        adapter.method2();
    }
}
