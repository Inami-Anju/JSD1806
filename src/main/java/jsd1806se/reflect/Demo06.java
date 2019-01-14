package reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) 
		throws Exception{
		/**
		 * �����ڼ����÷���API���ұ�ע�ڷ����ϵ�ע��
		 * 1. ��̬������
		 * 2. ��̬�ҵ�ȫ������
		 * 3. ���ҷ����ϱ�ע��ע��
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("����������");
		String className = in.nextLine();
		//��̬������
		Class cls = Class.forName(className);
		//��̬����ȫ������
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			//method ���� cls ����ÿһ������
			System.out.println(method); 
			// Annotation ע�⣬getAnnotations()
			// ���ڻ�ȡ��ע�ڷ����ϵ�ע�⡣
			Annotation[] annotations=
					method.getAnnotations();
			for (Annotation ann : annotations) {
				System.out.println(ann); 
			}
		}
	}

}







