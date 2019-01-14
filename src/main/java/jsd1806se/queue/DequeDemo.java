package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque�ӿ�  ˫�˶��У���Queue���ӽӿڡ�
 * ˫�˶��е��ص���:�������˶������������Ӳ�����
 * ����ʵ����:java.util.LinkedList
 * 
 * @author adminitartor
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		deque.offer("three");
		System.out.println(deque);
		//�Ӷ������
		deque.offerFirst("four");
		System.out.println(deque);
		//�Ӷ�β���
		deque.offerLast("five");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
	}
}










