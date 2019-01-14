package designPatterns.decoratorPattern.decorator;

import designPatterns.decoratorPattern.component.饮品;
/**
 * 装饰者模式中,所有装饰者的父类
 */
public abstract class Decorator extends 饮品 {

    protected 饮品 yp;

    public Decorator(饮品 yp) {
        this.yp = yp;
    }
}
