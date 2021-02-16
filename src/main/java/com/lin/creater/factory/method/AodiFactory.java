package com.lin.creater.factory.method;

public class AodiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Aodi();
    }
}
