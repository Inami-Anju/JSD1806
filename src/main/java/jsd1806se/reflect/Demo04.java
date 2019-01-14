package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) 
		throws Exception{
		/**
		 * ���÷���ִ��һ������ȫ����testΪ��ͷ�ķ���
		 */
		// 1. ��̬��ȡ����
		Scanner in = new Scanner(System.in);
		System.out.print("����������");
		String className = in.nextLine();
		// 2. ����������̬�����ൽ������
		Class cls = Class.forName(className);
		System.out.println(cls); 
		// 3. ��̬��������
		Object obj = cls.newInstance();
		System.out.println(obj); 
		// 4. ��̬����ȫ������
		Method[] methods=cls.getDeclaredMethods();
		// 5. ����ȫ���������ҵ���testΪ��ͷ�ķ���
		for(Method method:methods){
			//��ȡ���������� method.getName();
			String name=method.getName();
			System.out.println(name); 
			//6. ��鷽�����Ƿ���testΪ��ͷ
			if(name.startsWith("test")){
				// 7. ִ���ҵ��ķ���
				method.invoke(obj);
			}
		}
	}
}
















