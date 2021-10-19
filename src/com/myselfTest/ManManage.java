package com.myselfTest;

public class ManManage implements People{
    Man man;

    public ManManage(People people){
        if(people.getClass() == Man.class){
            this.man = (Man) people;
        }
    }

    @Override
    public void giveMoney() {
        System.out.println("帮忙上交");
        man.giveMoney();
    }
}
