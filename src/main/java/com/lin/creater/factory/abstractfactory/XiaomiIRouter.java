package com.lin.creater.factory.abstractfactory;

public class XiaomiIRouter implements IRouterProduct{
    @Override
    public void star() {
        System.out.println("小米路由开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由关机");
    }

    @Override
    public void openWifi() {
        System.out.println("小米打开Wifi");
    }

}
