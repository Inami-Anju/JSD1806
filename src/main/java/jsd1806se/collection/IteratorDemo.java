package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������
 * Collection�ṩ��ͳһ�ı������ϵķ�ʽ:������ģʽ
 * ��Ӧ����:
 * Iterator iterator()
 * �÷������Է���һ�����ڱ�����ǰ���ϵĵ�����
 * 
 * java.util.Iterator�ӿ�
 * �������ӿڹ涨�˵������������ϵ���ز�����������ʽ
 * Ӧ����ѭ:�ʣ�ȡ��ɾ�Ĺ��̣���ɾ��Ԫ�ز������Ǳ��������
 * ��ͬ�ļ��϶�ʵ����һ�����Ա�������ĵ�����ʵ���ࡣ����
 * �����סʵ��������֣�ֻҪ����ΪIterator����������(��̬)
 * 
 * 
 * @author adminitartor
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println(c);
		
		//��ȡ������
		Iterator it = c.iterator();
		/*
		 * boolean hasNext()
		 * �жϼ����Ƿ�����һ��Ԫ�ؿ��Ե�����
		 * �ʵĹ���
		 */
		while(it.hasNext()){
			/*
			 * E next()
			 * ͨ����������ȡ������һ��Ԫ�ء�
			 * ȡ�Ĺ���
			 */
			String str = (String)it.next();
			System.out.println(str);
			/*
			 * �ڱ����Ĺ�����ɾ��#����
			 * ��Ҫע��:
			 * ��������һ��Ҫ�󣬾����ڱ����Ĺ����в���
			 * ʹ�ü��ϵķ�����ɾԪ�أ�������׳��쳣��
			 * ����ͨ�������������ṩ��remove����ɾ��
			 * Ԫ�ء��÷�������Ҫ���������ɾ������ͨ��
			 * next����ȡ����Ԫ�ء�
			 */
			if("#".equals(str)){
//				c.remove(str);
				it.remove();
			}
		}
		
		System.out.println(c);
	}
}
















