package designPatterns.decoratorPattern.component;

public class 啤酒 extends 饮品 {
    public 啤酒() {
        name="啤酒";
    }

    @Override
    public int price() {
        return 3;
    }
}
