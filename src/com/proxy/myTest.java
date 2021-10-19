package com.proxy;


public class myTest {
    public static void main(String[] args) {
        Teacher stu01 = new Student("张三");
        StudentProxy stu02 = new StudentProxy(stu01);
        stu02.getMoney();
    }




}
