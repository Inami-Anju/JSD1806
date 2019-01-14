package thread;
/**
 * �̵߳����ȼ�
 * �̵߳����ȼ���10���ȼ����ֱ�������1-10��ʾ��
 * ����1��������ȼ���10Ϊ��ߣ�5��Ĭ��ֵ��
 * 
 * ���������ȼ�Խ�ߵ��̻߳�ȡCPUʱ��Ƭ�Ĵ�����Խ�ࡣ
 * �߳��ǲ���������ȡCPUʱ��Ƭ�ģ�ֻ�ܱ����ı����䣬ͨ��
 * �������ȼ��������̶ȸ��ƻ�ȡʱ��Ƭ�Ĵ�����
 * 
 * @author adminitartor
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("min");
				}
			}
		};
		Thread norm = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
			}
		};		
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		norm.start();
		max.start();
	}
}









