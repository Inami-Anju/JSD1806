package thread;
/**
 * ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ǰ���¾����ܵ�
 * ��߲���Ч�ʡ�
 * 
 * ͬ������Ը�׼ȷ�Ŀ�����Ҫͬ�����еĴ���Ƭ��
 * �﷨��
 * synchronized(ͬ������������){
 *   ��Ҫͬ�����еĴ���Ƭ��
 * }
 * ʹ��ͬ����ʱ��Ҫע�⣬���뱣֤����߳̿�����ͬ��������
 * ������[ͬһ��]ʱ����Щ�߳���������Ĵ������ͬ���ġ�
 * @author adminitartor
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Shop shop = new Shop();		
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}

class Shop{
//	public synchronized void buy(){
	public void buy(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":�������·�");
			Thread.sleep(5000);
			
			synchronized (this) {
				System.out.println(t.getName()+":�������·�");
				Thread.sleep(5000);
			}
			
			
			System.out.println(t.getName()+":�����뿪");
		} catch (Exception e) {
		}			
	}
}









