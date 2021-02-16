package com.lin.creater.factory.abstractfactory;

/**
 * 不符合开闭原则
 * 每增加一个新的产品，需要在超级抽象工厂（IProductFactory）产生一个抽象方法接口，然后对其进行实现，所有子类都要进行修改
 * 适用于稳定的运行环境下
 * 优点：无需关心创建细节，直接通过工厂获取，一系列产品统一到一起创建
 * 缺点：产品增加困难，增加系统的抽象性和理解难度
 */
public interface IProductFactory {
    IphoneProduct getIphoneProduct();
    IRouterProduct getIRouterProduct();
}
