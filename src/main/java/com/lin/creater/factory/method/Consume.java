package com.lin.creater.factory.method;

public class Consume {

    public static void main(String[] args) {
        Car car = new AodiFactory().getCar();
        Car car1 = new BaoMaFactory().getCar();
        car.name();
        car1.name();
    }
}
