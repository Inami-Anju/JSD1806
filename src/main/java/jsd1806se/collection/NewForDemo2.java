package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ʹ����ѭ����������
 * @author adminitartor
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * ��ѭ�������������ջᱻ�������ı�Ϊ����������
		 * ������ʹ����ѭ���������ϵĹ����в�Ҫͨ������
		 * �ķ�����ɾԪ�ء�
		 */
		for(Object o : c){
			String str = (String)o;
			System.out.println(str);
		}
	}
}







