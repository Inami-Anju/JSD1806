package list;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List �ӿ�
 * List��Collection���ӽӿڣ��涨��List��������ع���
 * List���ϵ��ص���:���ظ������������ṩ��һ��ͨ���±�
 * ����Ԫ�صķ���
 * 
 * ����ʵ����:
 * java.util.ArrayList:�ڲ�������ʵ�֣���ѯЧ�ʺã�����
 * ��ɾԪ��Ч�ʲ�
 * 
 * java.util.LinkedList:�ڲ�������ʵ�֣���ѯЧ�ʲ��
 * ��ɾЧ�ʺã�������β��ɾԪ��Ч�ʸߡ�
 * 
 * �ڶ�Ԫ�ز���Ч��û���ر����Ҫ��ʱ��ͨ��ʹ�õĶ���
 * ArrayList������ϡ�
 * @author adminitartor
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);		
		/*
		 * List�ṩ�����ص�add,remove
		 * 
		 * void add(int index,E e)
		 * ������Ԫ�ز��뵽ָ��λ��
		 */
		list.add(1, "2");
		System.out.println(list);
		
		/*
		 * ɾ��������Ԫ��
		 * 
		 * E remove(int index)
		 * ɾ��������ָ���±��Ӧ��Ԫ��
		 */
		String old = list.remove(2);
		System.out.println(list);
		System.out.println("old:"+old);
	}
}









