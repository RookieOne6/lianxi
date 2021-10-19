package com.proxy;

import java.lang.reflect.Proxy;

public class MoveProxy {
    public static void main(String[] args) {
        Student student = new Student("李四");
        MyInvocationHandle myInvocationHandle = new MyInvocationHandle();
        myInvocationHandle.bind(student);
        Teacher teacher = (Teacher) Proxy.newProxyInstance(student.getClass().getClassLoader(), student.getClass().getInterfaces(), myInvocationHandle);
        teacher.getMoney();
    }

}
