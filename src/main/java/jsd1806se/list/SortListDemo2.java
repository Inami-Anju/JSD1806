package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ�������Ԫ��
 * @author adminitartor
 *
 */
public class SortListDemo2 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(3, 6));
		list.add(new Point(1, 8));
		list.add(new Point(2, 4));
		list.add(new Point(5, 7));
		list.add(new Point(9, 0));
		list.add(new Point(3, 4));
		System.out.println(list);
		/*
		 * Collections.sort(List list)
		 * �÷��������������ʱ�Լ���Ԫ����һ��Ҫ��
		 * ����Ԫ�ر���ʵ����Comparable�ӿڣ��������
		 * ��ͨ����
		 */
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}
}







