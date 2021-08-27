package com.ariverh.structural.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private Integer age;
    private Map<String,Person> childrens = new HashMap<>();

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public Map<String,Person> getChildrens(){
        return this.childrens;
    }
    public void addChildren(Person children){
        if (childrens.get(children.getName()) == null){
            childrens.put(children.getName(),children);
        }
    }

    public Person getChildren(String name){
        return childrens.get(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
