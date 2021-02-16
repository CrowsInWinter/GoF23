package com.lin.creater.factory.simple;

public class Consume {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car baoma = carFactory.getCar("宝马");
        System.out.println(baoma.name());
        Car tesla = carFactory.getCar("tesla");
        System.out.println(tesla == null);
    }
}
