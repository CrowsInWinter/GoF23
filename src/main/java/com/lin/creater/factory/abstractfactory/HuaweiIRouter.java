package com.lin.creater.factory.abstractfactory;

public class HuaweiIRouter implements IRouterProduct{
    @Override
    public void star() {
        System.out.println("华为路由开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为打开Wifi");
    }

}
