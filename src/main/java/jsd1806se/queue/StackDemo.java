package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ�ṹ
 * ջҲ���Դ��һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ:�Ƚ����ԭ��
 * 
 * ˫�˶������ֻ��ͬһ���������Ӳ���ʱ����ʵ����ջ������
 * Ϊ��˫�˶���DequeΪջ�ṩ�˶�Ӧ�ķ���
 * ��ջ����:push
 * ��ջ����:pop
 * @author adminitartor
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		//��ջ����
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		
		System.out.println(stack);
		//��ջ����
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
	}
}









