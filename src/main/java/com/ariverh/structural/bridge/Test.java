package com.ariverh.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Source1 source1 = new Source1();
        MyBridge myBridge = new MyBridge(source1);
        myBridge.method();

        Source2 source2 = new Source2();
        myBridge.setSource(source2);
        myBridge.method();
    }
}
