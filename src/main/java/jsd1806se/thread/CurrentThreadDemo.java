package thread;
/**
 * �߳��ṩ��һ����̬����:
 * static Thread currentThread()
 * �÷������Ի�ȡ����������������߳�
 * 
 * ��ThreadLocal���API�о�Ҫ�������������ɲ�����
 * ��ThreadLocal�ں����кܶ�Ӧ�ã�����Spring����AOP���
 * �������ʱ��Ҫʹ�õ���
 * 
 * @author adminitartor
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		//��ȡ����main�������߳�
		Thread main = Thread.currentThread();
		System.out.println("����main�������߳�Ϊ:"+main);
		dosome();
		
		Thread thread = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("�Զ����߳�:"+t);
				dosome();
			}
		};
		thread.start();
	}
	
	public static void dosome(){
		Thread thread = Thread.currentThread();
		System.out.println("����dosome�������߳���:"+thread);
	}
}









