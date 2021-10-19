package com.myselfTest;

public class demo {
    public static void main(String[] args) {
        People people = new Man("张三");
        People police = new ManManage(people);
        police.giveMoney();
    }
}
