package designPatterns.decoratorPattern;
import designPatterns.decoratorPattern.component.*;
import designPatterns.decoratorPattern.decorator.*;
public class Test {
    public static void main(String[] args){
        饮品 yp=new 可乐();
             yp=new 兑水(yp);
             yp=new 加醋(yp);
             System.out.println("饮品名:" + yp.getName() + "---价格:" + yp.price());
    }
}
