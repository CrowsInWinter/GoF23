package com.lin.creater.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("===============小米产品===============");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.getIphoneProduct();
        iphoneProduct.star();
        iphoneProduct.sendMSM();
        iphoneProduct.shutdown();
        IRouterProduct iRouterProduct = xiaomiFactory.getIRouterProduct();
        iRouterProduct.star();
        iRouterProduct.openWifi();

        System.out.println("===============华为产品===============");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct iphoneProduct1 = huaweiFactory.getIphoneProduct();
        iphoneProduct1.star();
        iphoneProduct1.sendMSM();
        iphoneProduct1.shutdown();
        IRouterProduct iRouterProduct1 = huaweiFactory.getIRouterProduct();
        iRouterProduct1.star();
        iRouterProduct1.openWifi();
    }
}
