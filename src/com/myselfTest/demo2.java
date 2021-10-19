package com.myselfTest;

import java.lang.reflect.Proxy;

public class demo2 {
    public static void main(String[] args) {
        People people = new Man("张三");
        MyInvocationHandle myInvocationHandle = new MyInvocationHandle();
        myInvocationHandle.bind(people);
        People o = (People) Proxy.newProxyInstance(people.getClass().getClassLoader(), people.getClass().getInterfaces(), myInvocationHandle);
        o.giveMoney();
    }



}
