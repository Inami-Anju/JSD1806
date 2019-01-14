package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * ���÷���API��������ڲ��ṹ 
		 */
		test("abc"); 
		test(123); 
		test(new ArrayList<>()); 
		Collection<String> c = new LinkedList<>();
		Iterator<String> ite = c.iterator();
		//ite �ľ�������������ʲô��
		test(ite);
	}
	
	public static void test(Object obj){
		//obj �ľ���������ʲô��
		//����ڷ����м�����ľ������ͣ�
		//���÷���API���ԡ���̬�������������
		//Object���϶�����getClass�����ڼ��
		//���ִ���ڼ����ľ������ͣ�
		Class cls = obj.getClass();
		System.out.println(cls); 
		
		//��һ����̬������͵��ڲ��ṹ��
		//1. �������������ȫ����Ա����
		// Declared ������ Field���ֶΣ���Ա����
		// getDeclaredFields�����Ĺ����Ǽ��cls
		// �����������ȫ�����ֶΣ���Ա������
		Field[] fields=cls.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field); 
		}
		
		//2. ������������ķ���(Method)
		// getDeclaredMethods ��̬��ȡ��ǰ������������
		// ������Ϣ���������̳еķ���
		// getMethods() ��ȡ��ǰ��ʹӸ����м̳еķ���
		Method[] methods=cls.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		 
		//3. ������������Ĺ��췽����Constructor��
		//���б�д�������롣����
	}
}









