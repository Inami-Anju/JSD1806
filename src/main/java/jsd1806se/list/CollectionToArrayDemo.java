package list;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ת��Ϊ�������
 * 
 * Collection�ṩ��һ������:toArray
 * �÷������Խ���ǰ����ת��Ϊһ�����顣
 * @author adminitartor
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
//		Object[] array = c.toArray();
		
		String[] array = c.toArray(new String[c.size()]);
		System.out.println(array.length);
		for(String str : array){
			System.out.println(str);
		}
	}
}








