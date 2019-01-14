package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳���Ҫ����������:
 * 1:�����߳�
 *   �߳���Ƶ���Ĵ������ٻ���̵߳��ȴ�����С�Ķ��⹤��
 *   �����ή�����ܡ�
 * 2:�����߳�����
 *   �߳��������󣬻ᵼ��ϵͳ��Դ������,ÿ���̶߳���Ҫ
 *   �ڴ����������С�
 *   ����һ�������ǣ�������̻߳ᵼ��CPU�����л�������
 *   ����Ĳ������ܽ��͡�
 * ���������������ʱ����Ӧ��ʹ���̳߳��������̡߳�    
 * @author adminitartor
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool 
			= Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable runnable = new Runnable(){
				public void run(){
					try {
						Thread thread = Thread.currentThread();
						System.out.println(thread.getName()+"����ִ������...");
						Thread.sleep(5000);
						System.out.println(thread.getName()+"ִ���������!");
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			};
			//������ָ�ɸ��̳߳�
			threadPool.execute(runnable);
			System.out.println("�����񽻸����̳߳�");
		}
		
		//�ر��̳߳�
//		threadPool.shutdown();
		threadPool.shutdownNow();
		System.out.println("�̳߳عر���");
	}
}

















