package com.lin.creater.factory.method;

/**
 * 工厂方法模式：每个车都有独自的生产工厂
 * 需要增加新的产品，只需要实现一个Car接口的产品类和一个实现CarFactor的工厂类
 * 符合开闭原则
 */
public interface CarFactory {
    Car getCar();
}
