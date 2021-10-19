package com.myselfTest;

public class Man implements People{
    private String name;

    public Man(String name){
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println("上交50元");
    }
}
