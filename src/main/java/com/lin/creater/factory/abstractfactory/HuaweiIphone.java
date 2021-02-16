package com.lin.creater.factory.abstractfactory;

public class HuaweiIphone implements IphoneProduct {
    @Override
    public void star() {
        System.out.println("华为开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为关机");
    }

    @Override
    public void sendMSM() {
        System.out.println("华为发送信息");
    }

    @Override
    public void call() {
        System.out.println("华为打电话");
    }
}
