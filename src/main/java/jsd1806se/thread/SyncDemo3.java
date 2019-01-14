package thread;
/**
 * ��̬������ʹ��synchronized���κ���ô�÷���һ������
 * ͬ��Ч����
 * ��̬������ʹ�õ�ͬ������������Ϊ�䷽��������������.
 * ����󣬼�:Class��һ��ʵ����ÿ���඼����ֻ��һ��Class
 * ʵ����֮��Ӧ������֪ʶ�л���ܣ�
 * @author adminitartor
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run() {
				Boo.dosome();
			}
		};
		Thread t2 = new Thread(){
			public void run() {
				Boo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}

class Boo{
	public synchronized static void dosome(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":��������dosome����");
			Thread.sleep(5000);
			System.out.println(t.getName()+":����dosome�������");
		} catch (Exception e) {
		}
	}
}








