package com.lin.creater.factory.abstractfactory;

public class HuaweiFactory implements IProductFactory{
    @Override
    public IphoneProduct getIphoneProduct() {
        return new HuaweiIphone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new HuaweiIRouter();
    }
}
