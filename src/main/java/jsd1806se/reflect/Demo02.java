package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args)
		throws Exception{
		/**
		 * ��̬�����࣬���Ҷ�̬��������
		 * ���´�����Զ�̬�����κε��࣬���������
		 * ע�⣺���ͱ������޲���������
		 */
		Scanner in = new Scanner(System.in);
		//�����ڼ�ͨ������̨��ȡ����
		System.out.print("����������");
		String className=in.nextLine();
		//��̬�����ൽ����������������ʱ�����쳣
		Class cls = Class.forName(className);
		//��ʾ���صĽ��
		System.out.println(cls);
		//��̬�����������û���޲���������ʱ���쳣
		Object obj = cls.newInstance(); //Foo
		//��ʾ�����õĶ��� 
		System.out.println(obj); 
		
		//��̬���뷽����
		System.out.print("���뷽������");
		String methodName = in.nextLine(); //test
		//���ݷ�������̬���ҷ���method
		//getDeclaredMethod ���ݸ����ķ���������
		//һ������������ֵ��һ�����������û���ҵ����쳣
		Method method=
				cls.getDeclaredMethod(methodName);
		//���������ķ���Ȩ��,�������ʲ��ɼ�����
		method.setAccessible(true);
		//��ִ̬�з���, obj ������һ��Ҫ����ָ���ķ�����
		Object val= method.invoke(obj);
		//val �Ƿ����ķ���ֵ�����û�з���ֵ��Ϊnull
		System.out.println(val); 
		
	}

}






