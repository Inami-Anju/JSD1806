package designPatterns.decoratorPattern.component;

public class 可乐 extends 饮品{

    public 可乐() {
        name="可乐";
    }

    @Override
    public int price() {
        return 30;
    }

}
