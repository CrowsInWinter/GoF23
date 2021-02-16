package com.lin.creater.factory.abstractfactory;

public class XiaomiFactory implements IProductFactory{
    @Override
    public IphoneProduct getIphoneProduct() {
        return new XiaomiIphone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new XiaomiIRouter();
    }
}
