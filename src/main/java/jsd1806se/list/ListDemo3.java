package list;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡ�Ӽ�����
 * @author adminitartor
 *
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);
		
		/*
		 * ���Ӽ�Ԫ������10��
		 */
		for(int i=0;i<subList.size();i++){
			subList.set(i, subList.get(i)*10);
		}
		
		//[30,40,50,60,70]
		System.out.println(subList);
		/*
		 * ���Ӽ�Ԫ�صĲ������Ƕ�ԭ���϶�ӦԪ�صĲ���
		 */
		System.out.println(list);
		
		
		/*
		 * ɾ��2-8
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}






