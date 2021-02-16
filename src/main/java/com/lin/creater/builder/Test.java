package com.lin.creater.builder;

public class Test{
    public static void main(String[] args) {
        Product product = new Worker().getProduct();
        System.out.println(product);

        Product product1 = new Worker().buildC("收银机").getProduct();
        System.out.println(product1);
    }
}
