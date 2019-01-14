package reflect;

import java.lang.reflect.Method;

public class JUnit {

	public static void main(String[] args) 
		throws Exception{
		/**
		 * ע�����;��ʾ��
		 * 
		 * ʵ��һ�����ߣ��Զ�ִ�����б�ע��@Test�ķ��� 
		 */
		String className="reflect.DemoAll";
		Class cls = Class.forName(className);
		Object obj=cls.newInstance(); 
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			//���ÿ���������Ƿ���� @Test ע��
			//getAnnotation(Test.class) ��鷽����
			//�Ƿ���� Test.class ע�⣬�������
			//�򷵻�ע�����͵Ķ����������������null
			Test ann = 
				method.getAnnotation(Test.class);
			if (ann != null) {
				//�ҵ�ע��
				method.invoke(obj);
			}
		}
	}
}








