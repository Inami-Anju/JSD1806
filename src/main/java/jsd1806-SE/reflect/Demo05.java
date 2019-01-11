package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args)
		throws Exception{
		/**
		 * ���÷���ִ���в����ķ���
		 * 
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("����������");
		String className = in.nextLine();
		System.out.print("���뷽������");
		String methodName = in.nextLine();
		//1. ��̬������
		Class cls = Class.forName(className);
		//2. ��̬��������
		Object obj = cls.newInstance();
		//3. �����в����ķ���, ��һ��������������
		//  �ڶ�������������String������Ҳ��������쳣
		Method method = cls.getDeclaredMethod(
				methodName, int.class, String.class);
		System.out.println(method);
		//4. ��̬��ȡ����
		System.out.print("�������1��");
		String p1 = in.nextLine();
		System.out.print("�������2��");
		String p2 = in.nextLine();
		int n = Integer.parseInt(p1);
		//5. ��ִ̬�з���
		Object val = method.invoke(obj, n, p2);
		System.out.println(val);
	}

}






