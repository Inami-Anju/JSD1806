package thread;
/**
 * �߳��ṩ��һ����̬����:
 * static void sleep(long ms)
 * �÷����Ὣ���и÷������߳���������״ָ̬�����롣��
 * ��ʱ���̻߳����»ص�RUNNABLE״̬���ȴ���ȡCPUʱ��Ƭ
 * �ٴβ�������
 * @author adminitartor
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("���������");
	}
}










