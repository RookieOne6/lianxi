package com.myselfTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandle implements InvocationHandler {
    Object object;

    public void bind(Object obj) {
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        return result;
    }
}
