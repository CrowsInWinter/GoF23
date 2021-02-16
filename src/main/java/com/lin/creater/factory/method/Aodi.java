package com.lin.creater.factory.method;

public class Aodi implements Car {
    @Override
    public String name() {
        System.out.println("奥迪");
        return "奥迪";
    }
}
