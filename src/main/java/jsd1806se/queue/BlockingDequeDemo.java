package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * BlockingQueue��BlockingDeque(˫��)
 * ��������
 * 
 * ���������ǲ�����ȫ�Ķ��У������ڲ���˫����ʵ��˫����
 * ��������ȡ�޻��⣬��߲���Ч��
 * @author adminitartor
 *
 */
public class BlockingDequeDemo {
	public static void main(String[] args) {
		BlockingQueue<String> queue 
			= new LinkedBlockingQueue<String>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		
		System.out.println(queue);
	}
}










