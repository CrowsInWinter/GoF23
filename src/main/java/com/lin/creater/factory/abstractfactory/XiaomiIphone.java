package com.lin.creater.factory.abstractfactory;

public class XiaomiIphone implements IphoneProduct{
    @Override
    public void star() {
        System.out.println("小米开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米关机");
    }

    @Override
    public void sendMSM() {
        System.out.println("小米发送信息");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }
}
