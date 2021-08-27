package com.ariverh.structural.facade;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void executeCpu(){
        this.cpu.execute();
    }

    public void executeMemory(){
        this.memory.execute();
    }

    public void executeDisk(){
        this.disk.execute();
    }
}
