package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Dynamic Proxy
 * @Author: Aesir
 * @Date: 2019/4/8 0:14
 */
public class StarHandler implements InvocationHandler {

    private Star realStar;
    private Star starProxy;

    public StarHandler(Star realStar, Star starProxy) {
        this.realStar = realStar;
        this.starProxy = starProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("sing")) {
            method.invoke(realStar, args);
        } else {
            method.invoke(starProxy, args);
        }

        return null;
    }
}
