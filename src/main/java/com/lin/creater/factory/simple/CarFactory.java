package com.lin.creater.factory.simple;

/**
 * 简单工厂模式（静态工厂模式）
 * 增加一个新的产品，必须对代码进行修改
 */
public class CarFactory {

    public Car getCar(String name){
        switch (name){
            case "奥迪":return new Aodi();
            case "宝马":return new BaoMa();
            case "大众":return new DaZong();
            default:return null;
        }
    }

    public Aodi getAodi(){
        return new Aodi();
    }

    public BaoMa getBaoMa(){
        return new BaoMa();
    }
}
