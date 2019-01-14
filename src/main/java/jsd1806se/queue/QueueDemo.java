package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue  ����
 * Queue�ӿڼ̳���Collection�����п��Ա���һ��Ԫ�أ�
 * ���Ǵ�ȡԪ�ر�����ѭ�Ƚ��ȳ�ԭ��
 * 
 * ����ʵ����:java.util.LinkedList
 * ����������Ա���һ��Ԫ�أ�������β��ɾԪ��Ч�ʺã���
 * ���������ز������ԡ�
 * 
 * @author adminitartor
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		//��Ӳ�������Ԫ�ؼ��뵽����ĩβ
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		
		int size = queue.size();
		System.out.println(size);
		
		/*
		 * ���Ӳ���
		 * ��ȡ����Ԫ�غ󣬸�Ԫ�ؼ��Ӷ����б��Ƴ�
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * E peek()
		 * ���ö���Ԫ�أ���ȡ����Ԫ�غ󣬸�Ԫ����Ȼ����
		 * �ڶ�����
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * ʹ�õ��������Ա������С�
		 */
		for(String s : queue){
			System.out.println(s);
		}
		System.out.println(queue);
	}
}









