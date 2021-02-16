package com.lin.creater.builder;

/**
 * 建造者模式：将产品的的建造和表示分离，实现了解耦，符合开闭原则
 * 使用建造者模式可以让客户端不必知道内部组成的细节
 * 缺点：
 * 1.如果产品内部变化复杂，可能会导致需要定义很多具体的建造者，导致系统变得庞大
 * 2.如果产品之间的差异较大，不适合使用建造者模式，因此其使用范围收到一定的限制
 */
public abstract class Builder {
    abstract Builder buildA(String msg);
    abstract Builder buildB(String msg);
    abstract Builder buildC(String msg);
    abstract Builder buildD(String msg);

    abstract Product getProduct();
}
