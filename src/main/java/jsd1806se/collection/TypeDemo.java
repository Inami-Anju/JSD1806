package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ����
 * ������JDK1.5֮���Ƴ�����һ�����ԣ�����Ҳ��Ϊ������
 * ���ͣ�ָ��ʹ��ĳ����ʱΪ�����ԣ�������������������ֵ
 * ������ָ��ʵ�����͡�����ʵ�ʿ����п��Դ����ߴ����
 * ���ȡ�
 * ����Ӧ�����ĵط����Ǽ��ϣ�����Լ�����ϵ�Ԫ�����͡�
 * ���͵�ʵ������ΪObject������ָ������ʱ��Ĭ�Ͼ�ʹ��
 * ԭ��Object��
 * @author adminitartor
 *
 */
public class TypeDemo {
	public static void main(String[] args) {
		//��������ʱͨ������Լ�����ϵ�Ԫ������
		Collection<String> c = new ArrayList<String>();
		c.add("one");//��ʱ����ֻ�ܴ��String
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		//��ȡ������ʱҲͨ�����͸�֪������Ԫ������
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			//��ȡԪ��ʱ����������
			String str = it.next();
			System.out.println(str);
		}
		//��ѭ��Ҳ����ֱ��ʹ��String���ռ���Ԫ����
		for(String str:c){
			System.out.println(str);
		}
		
	}
}








