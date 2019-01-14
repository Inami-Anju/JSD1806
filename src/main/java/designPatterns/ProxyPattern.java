package designPatterns;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * ---------------------------------------------------------------------------------
 * 什么情况使用代理模式：
 * ①不想修改原类但想做改动，用代理类（(1)设计模式中有一个设计原则是开闭原则，是说对修改关闭对扩展开放，
 * 我们在工作中有时会接手很多前人的代码，里面代码逻辑让人摸不着头脑
 * (sometimes the code is really like shit)，这时就很难去下手修改代码，
 * 那么这时我们就可以通过代理对类进行增强。）
 * ②我们在使用RPC框架的时候，框架本身并不能提前知道各个业务方要调用哪些接口的哪些方法 。
 * 那么这个时候，就可用通过动态代理的方式来建立一个中间人给客户端使用，也方便框架进行搭建逻辑，
 * 某种程度上也是客户端代码和框架松耦合的一种表现。
 *(3)Spring的AOP机制就是采用动态代理的机制来实现切面编程。
 * https://blog.csdn.net/u011784767/article/details/78281384
 * ----------------------------------------------------------------------------------
 */
public class ProxyPattern {
    public static void main(String[] args){
        List target=new ArrayList();
        ClassLoader classLoader=ProxyPattern.class.getClassLoader();
        Class<?>[]   interfac={List.class};
        InvocationHandler handler=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before");
                final Object invoke = method.invoke(target, args);
                System.out.println("after");
                return false;
            }
        };
        List list= (List) Proxy.newProxyInstance(classLoader,interfac,handler);

        list.add("1");
        list.add("2");

        for(Object o:list){
            System.out.println(o.toString());
        }
    }
}
