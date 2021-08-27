package com.ariverh.structural.composite;

public class Test {
    public static void main(String[] args) {
        Person laoWang = new Person("老王",50);
        Person children1 = new Person("小王1号",25);
        Person children2 = new Person("小王2号",20);
        Person children3 = new Person("小王3号",18);
        Person children4 = new Person("小王4号",12);
        laoWang.addChildren(children1);
        laoWang.addChildren(children2);
        laoWang.addChildren(children3);
        laoWang.addChildren(children4);

        Person children11 = new Person("小小王1号",1);
        Person children12 = new Person("小小王2号",2);
        Person children13 = new Person("小小王3号",3);
        Person children14 = new Person("小小王4号",4);
        children1.addChildren(children11);
        children1.addChildren(children12);
        children1.addChildren(children13);
        children1.addChildren(children14);


        System.out.println("老王的小孩：");
        laoWang.getChildrens().forEach((name,children)->{
            System.out.println("{" + children.getName() + "," + children.getAge() + "}");
        });
        System.out.println("小王1号的小孩：");
        children1.getChildrens().forEach((name,children)->{
            System.out.println("{" + children.getName() + "," + children.getAge() + "}");
        });

    }
}
