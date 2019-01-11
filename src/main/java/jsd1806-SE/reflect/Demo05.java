package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args)
		throws Exception{
		/**
		 * 利用反射执行有参数的方法
		 * 
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("输入类名：");
		String className = in.nextLine();
		System.out.print("输入方法名：");
		String methodName = in.nextLine();
		//1. 动态加载类
		Class cls = Class.forName(className);
		//2. 动态创建对象
		Object obj = cls.newInstance();
		//3. 查找有参数的方法, 第一个参数是整数，
		//  第二个参数类型是String，如果找不到就抛异常
		Method method = cls.getDeclaredMethod(
				methodName, int.class, String.class);
		System.out.println(method);
		//4. 动态获取参数
		System.out.print("输入参数1：");
		String p1 = in.nextLine();
		System.out.print("输入参数2：");
		String p2 = in.nextLine();
		int n = Integer.parseInt(p1);
		//5. 动态执行方法
		Object val = method.invoke(obj, n, p2);
		System.out.println(val);
	}

}






