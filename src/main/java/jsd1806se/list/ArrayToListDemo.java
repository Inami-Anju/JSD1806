package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * ����Ĺ�����:Arrays�ṩ��һ����̬����:asList
 * ���Խ�һ������ת��ΪList����
 * @author adminitartor
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/*
		 * �Լ���Ԫ�ز������Ƕ�ԭ�����ӦԪ�ز���
		 */
		list.set(1, "2");
		System.out.println(list);
		
		System.out.println("array:"+Arrays.toString(array));
		
		/*
		 * ������ɾԪ�ػᵼ���������ݻ����ݣ������鱾���Ƕ���
		 * �ģ����Լ�Ȼ����ת���ļ��ϱ�ʾ�����飬��ô�Ͳ�����
		 * ɾԪ�أ�������׳��쳣��
		 */
//		list.add("five");
		
		/*
		 * ����Լ���Ԫ����ɾ����Ҫ���д���һ�����ϲ���
		 * ������ת���ļ���������Ԫ�ؼ��ɡ�
		 */
//		List<String> list2 = new ArrayList<String>();
//		list2.addAll(list);
		/*
		 * ���м��϶��ṩ��һ������ΪCollection���͵�
		 * ���췽�����������ڴ�����ǰ���ϵ�ͬʱ��������
		 * �����е�����Ԫ�ء������������ʵ�������̵�ͬ
		 * ����������
		 */
		List<String> list2 = new ArrayList<String>(list);
		System.out.println("list2:"+list2);
		list2.add("five");
		System.out.println("list2:"+list2);
	}
}







