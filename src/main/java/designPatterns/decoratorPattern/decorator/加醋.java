package designPatterns.decoratorPattern.decorator;

import designPatterns.decoratorPattern.component.饮品;

public class 加醋 extends Decorator {

    public 加醋(饮品 yp) {
        super(yp);
    }

    public void addVinegar(){
        System.out.println("还要加醋,加完了");
    }

    @Override
    public int price() {
        return 5 + yp.price();
    }

    /**
     * 再复写一个名字的方法<br/>
     * 现在已经不是单纯的饮品了
     * @return
     */
    @Override
    public String getName() {
        //在这里加个醋
        addVinegar();
        return "加醋的" + yp.getName();
    }

}
