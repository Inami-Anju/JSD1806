package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ����һ��ͨ���±����Ԫ�صķ���:
 * set,get
 * @author adminitartor
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);	
		
		/*
		 * E get(int index)
		 * ��ȡָ��λ�ö�Ӧ��Ԫ��
		 */
		String str= list.get(1);
		System.out.println(str);
		
		//��ͨѭ��Ҳ���Ա���List����
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			System.out.println(str);
		}
		
		/*
		 * E set(int index,E e)
		 * ������Ԫ�����õ�ָ��λ�ã�����ֵΪԭλ�ö�Ӧ
		 * ��Ԫ��(�滻Ԫ�ز���)
		 */
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println("old:"+old);
		
		
		
	}
}






