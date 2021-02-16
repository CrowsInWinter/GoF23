package com.lin.creater.factory.method;

public class BaoMa implements Car {
    @Override
    public String name() {
        System.out.println("宝马");
        return "宝马";
    }
}
