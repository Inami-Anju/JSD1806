package designPatterns.decoratorPattern.decorator;

import designPatterns.decoratorPattern.component.饮品;

public class 兑水 extends Decorator {

    public 兑水(饮品 yp) {
        super(yp);
    }
    //----------------------------------------------------
    public void 兑水(){
        //构造方法的名字必须与定义他的类名完全相同，没有返回类型，甚至连void也没有
        System.out.println("饮料兑水....尴尬不老铁...");
    }
    /***
     * 那么兑水后的价格应该是多少呢?<br/>
     * 应该是兑水的价格加饮品的价格
     * @return 兑水2块
     */
    @Override
    public int price() {
        return 02 + yp.price();
    }

    /**
     * 再复写一个名字的方法<br/>
     * 现在已经不是单纯的饮品了
     * @return
     */
    @Override
    public String getName() {
        兑水();
        return "兑水了的" + yp.getName();
    }
}
