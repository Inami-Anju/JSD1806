package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ���ϵ�����
 * �����ṩ��һ��������:java.util.Collections
 * ���ϵĹ������ṩ�����ɾ�̬���������Է������ǶԼ�����
 * һϵ�в���������֮һ��������
 * ��Ҫע�⣬�ṩ�ķ���ֻ�ܶ�List����������ΪSet����
 * ��ȫ������ġ�
 * @author adminitartor
 *
 */
public class SortListDemo1 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		/*
		 * sort������Լ���Ԫ�ؽ�����Ȼ����(��С����)
		 */
		Collections.sort(list);
		System.out.println(list);
		
	}
}










