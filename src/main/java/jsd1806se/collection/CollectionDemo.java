package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection ����
 * ���Ͽ��Ա���һ��Ԫ�أ������ṩ�˲���Ԫ�ص���ط�����
 * Collection�������������õ��ӽӿڣ�
 * java.util.List:���Ա����ظ�����������
 * java.util.Set:�����ظ�
 * 
 * �Ƿ��ظ�ָ����Ԫ���Ƿ�����ظ������ж��Ƿ��ظ��ı�׼
 * ������Ԫ������equals�ȽϵĽ����
 * 
 * @author adminitartor
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * ������Ԫ����ӵ����ϵ��У����ɹ���Ӻ󷽷�
		 * �᷵��true�����ʧ�ܷ���false
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * int size()
		 * ��ȡ��ǰ����Ԫ�ظ���
		 */
		int size = c.size();
		System.out.println("size:"+size);
		
		/*
		 * boolean isEmpty()
		 * �жϵ�ǰ�����Ƿ�Ϊ�ռ�(�������κ�Ԫ��)
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("�Ƿ�Ϊ�ռ�:"+isEmpty);
		
		/*
		 * void clear()
		 * ��ռ���
		 */
		c.clear();
		System.out.println("���������");
		System.out.println("size:"+c.size());
		System.out.println("isEmpty:"+c.isEmpty());
		System.out.println(c);
	}
}







