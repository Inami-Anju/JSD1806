package thread;

import org.omg.CORBA.LongHolder;

/**
 * �߳��ṩ�˻�ȡ�߳���Ϣ����ط���
 * @author adminitartor
 *
 */
public class InfoDemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		//��ȡ�̵߳�Ψһ��ʾ
		long id = main.getId();
		System.out.println("id:"+id);
		//��ȡ�߳�����
		String name = main.getName();
		System.out.println("name:"+name);
		//��ȡ�߳����ȼ�
		int priority = main.getPriority();
		System.out.println("���ȼ�:"+priority);
		//�ж��߳��Ƿ��ڻ״̬
		boolean isAlive = main.isAlive();
		System.out.println("isAlive:"+isAlive);
		//�ж��߳��Ƿ�Ϊ�ػ��߳�
		boolean isDaemon = main.isDaemon();
		System.out.println("isDaemon:"+isDaemon);
		//�ж��߳��Ƿ��Ǳ��жϵ�
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted:"+isInterrupted);
		
		
		
		
	}
}









