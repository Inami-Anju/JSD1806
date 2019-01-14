package thread;
/**
 * ��һ���̵߳���sleep�������������״̬�����������
 * �����������̵߳����˸��̵߳�interrupt�����ж�ʱ��
 * ��ʱ����ֱ�ӽ����߳��жϣ����ǻ�����˯����������ʱ
 * sleep�������׳��ж��쳣��
 * ���ԣ���һ���̴߳�������ʱ��inerrupt�������ж�����
 * ״̬���������жϸ��̡߳�
 * @author adminitartor
 *
 */
public class SleepDemo2 {
	public static void main(String[] args) {
		/*
		 * JDK1.8֮ǰ������JVM�ڴ�������⣬��һ��Ҫ��:
		 * ��һ�������еľֲ�����(�����÷�������)����
		 * ��������������ֲ��ڲ���������ʱ���ñ�������
		 * ������Ϊfinal��
		 */
		final Thread lin = new Thread(){
			public void run(){
				System.out.println("��:�������ݣ�˯һ���~");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("��:�����أ������أ������أ�����������!");
				}
				System.out.println("��:����");		
			}
		};
		
		Thread huang = new Thread(){
			public void run(){
				System.out.println("��:��ʼ��ǽ!");
				for(int i=0;i<5;i++){
					System.out.println("��:80!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("�۵���");
				System.out.println("��:�㶨!");
				lin.interrupt();//�ж�lin�߳�
			}
		};
		
		huang.start();
		lin.start();
		
	}
}









