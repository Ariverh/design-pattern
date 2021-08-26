package com.ariverh.creational.builer.parttern01;

public class House {
    private Integer size; //房子大小
    private Integer number; //房子层数
    private String step1;
    private String step2;
    private String Step3;

    @Override
    public String toString() {
        return "House{" +
                "size=" + size +
                ", number=" + number +
                ", step1='" + step1 + '\'' +
                ", step2='" + step2 + '\'' +
                ", Step3='" + Step3 + '\'' +
                '}';
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStep1() {
        return step1;
    }

    public void setStep1(String step1) {
        this.step1 = step1;
    }

    public String getStep2() {
        return step2;
    }

    public void setStep2(String step2) {
        this.step2 = step2;
    }

    public String getStep3() {
        return Step3;
    }

    public void setStep3(String step3) {
        Step3 = step3;
    }
}
