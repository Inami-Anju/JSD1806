package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean remove(E e)
 * �Ӽ�����ɾ������Ԫ��
 * @author adminitartor
 *
 */
public class RemoveDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		System.out.println(c);
		
		Point p = new Point(1, 2);
		/*
		 * ɾ��Ҳ��ɾ�������������Ԫ��equals�Ƚ�Ϊtrue
		 * ��Ԫ�أ�����List���ԣ��ظ�Ԫ��ֻɾ����һ��
		 */
		c.remove(p);
		System.out.println(c);
		
		
	}
}














