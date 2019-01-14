package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections�ṩ��һ�����ص�sort����������������һ
 * ������ıȽ��������ոñȽ����Ĺ����Ԫ�رȽϴ�С�����
 * ����
 * 1:����ʽ�����Զ��������
 * 2:��Ҫ��Ԫ�ر���ʵ��Comparable�ӿڣ�û��������
 * @author adminitartor
 *
 */
public class SortListDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("С����ʦ");
		list.add("����");
		list.add("����ʦ");		
		System.out.println(list);
//		Collections.sort(list);
		/*
		 * Comparator�ӿ�Ҫ�����ʵ��compare�������÷���
		 * �������������������Ĵ�С��ϵ��
		 * ������ֵ>0ʱ:o1>o2������ֵ������Comparable�ӿ�
		 * ��Ӧ����һ�¡�
		 * 
		 */
		Collections.sort(list,new Comparator<String>(){
			public int compare(String o1, String o2) {	
				return o1.length()-o2.length();
			}	
		});
		System.out.println(list);
		
	}
}









