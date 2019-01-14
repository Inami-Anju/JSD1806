package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ������ȫ�ļ���
 * @author adminitartor
 *
 */
public class SyncCollectionDemo {
	public static void main(String[] args) {
		/*
		 * ���ϵĹ�����Collections���Խ����еļ���ת��
		 * Ϊһ���̰߳�ȫ�ģ����ڼ�������Ĳ�����:add,
		 * remove�ȶ����Ա�֤������ȫ��
		 * ����API�ֲ�Ҳ��˵����һ��������ȫ�ļ���Ҳ����
		 * ʹ�õ������������������⣬����ζ�Ų���������
		 * �����뼯������������ǲ�����ȫ�ģ���Ҫ����ά��
		 * �����ϵ��
		 */
		/*
		 * List�ĳ���ʵ����:ArrayList,LinkedList��
		 * �����̰߳�ȫ��
		 * ����ͨ��Collections��Listת��Ϊ�̰߳�ȫ��
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		
		list = Collections.synchronizedList(list);
		System.out.println(list);
		
		
		//HashSetҲ�����̰߳�ȫ��  
		Set<String> set = new HashSet<String>(list);
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		
		
	}
}






