package com.ariverh.structural.facade;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.executeCpu();
        computer.executeMemory();
        computer.executeDisk();
    }
}
