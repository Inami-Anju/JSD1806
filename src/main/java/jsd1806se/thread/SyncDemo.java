package thread;
/**
 * ���̲߳�����ȫ����
 * ������̲߳�������ͬһ��Դʱ�������߳��л�ʵ�ʲ��ɿ�
 * �ᵼ�²����߼�ִ��˳����ֻ��ң�����ʱ�ᵼ��ϵͳ̱����
 * 
 * @author adminitartor
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//ģ���߳��л�
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//ģ���߳��л�
					System.out.println(getName()+":"+bean);
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}
}


class Table{
	private int beans = 20;
	/**
	 * ��һ��������synchronized���κ󣬸÷������
	 * ͬ����������:����߳��޷�ͬʱ�ڸ÷����ڲ����С�
	 * ������������Ϊͬ���������Խ��������ȫ����
	 * 
	 * �ڷ�����ʹ��synchronized����ôͬ���������������
	 * ��ǰ�����������󣬼�:�����п�����this
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("û�ж�����!");
		}
		/*
		 * ��һ���߳�ִ�е�Thread�ľ�̬����yield�󣬸�
		 * �̻߳�������������CPUʱ��Ƭ���ص�RUNNABLE״
		 * ̬���ȴ��̵߳����ٴη���ʱ��Ƭ.
		 * ע:�߳�û�з�������������ȡʱ��Ƭ������������
		 * ����ʱ��Ƭ��
		 */
		Thread.yield();//ģ���߳��л�
		return beans--;
	}
}













