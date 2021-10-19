package com.proxy;

public class Student implements Teacher{
    private String name;
    public Student(String name){
        this.name = name;

    }

    @Override
    public void getMoney() {
        System.out.println("上交班费50元");
    }
}
