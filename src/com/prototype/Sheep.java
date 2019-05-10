package com.prototype;

import java.util.Date;

/**
 * @ProjectName: Design Patterns
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/23 22:48
 */
public class Sheep implements Cloneable {
    private String name;
    private boolean sex;
    private String color;

    /**
     * Clone method comes from object and is a native method.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }

    public Sheep() {
    }

}
