package thread;
/**
 * �ػ��߳�
 * �ػ��߳�Ҳ��Ϊ��̨�̣߳�Ĭ�ϴ������̶߳������ػ��߳�
 * Ҳ�ɳ�ΪĬ�ϴ������߳�Ϊ��ͨ�̻߳�ǰ̨�̡߳�
 * 
 * �ػ��߳���ʹ��������ͨ�߳�һ���������ڽ���ʱ������һ
 * �㲻ͬ����:���̽���ʱ
 * 
 * ���̵Ľ���:��һ�������е�������ͨ�̶߳�����ʱ������
 * �ͻ��������ʱ�������������е��ػ��̶߳��ᱻǿ���ж�
 * 
 * GC�����������ػ��߳��ϵġ�ͨ����һ���������ǲ�������
 * ��ʱ������ֻҪ��Ҫ��ҵ��ִ����Ϻ���Ը��Ž���������
 * �Ϳ���������һ���ػ��߳��ϡ�
 * 
 * @author adminitartor
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("rose:����������AAAAAAaaaaa....");
				System.out.println("��ͨ��");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump!i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};	
		rose.start();
		
		/*
		 * ����Ϊ�ػ��߳�,ע:Ҫ�ڸ��߳�����֮ǰ��������
		 */
		jack.setDaemon(true);
		jack.start();
		
//		while(true){
//			
//		}
	}
}










