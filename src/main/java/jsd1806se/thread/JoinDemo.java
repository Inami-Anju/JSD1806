package thread;

/**
 * �߳��ṩ��һ������: void join() �÷�������ʹһ���߳�����һ���߳��ϵȴ�(��������״̬)�� ֱ������ɹ������ټ������С�
 * join����Э���߳�֮���ͬ�����С�
 * 
 * ͬ��:ִ�����Ⱥ�˳��ĳ�Ϊͬ�����С� �첽:ִ�����Ⱥ�˳��ͨ���������д�������첽���С�
 * 
 * @author adminitartor
 *
 */
public class JoinDemo {
	// ��ʾͼƬ�Ƿ��������
	private static boolean isFinish = false;

	public static void main(String[] args) {
		final Thread download = new Thread() {
			public void run() {
				System.out.println("down:��ʼ����ͼƬ...");
				for (int i = 1; i <= 100; i++) {
					System.out.println("down:" + i + "%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:ͼƬ�������!");
				isFinish = true;// ͼƬ��������
			}
		};

		Thread show = new Thread() {
			public void run() {
				System.out.println("show:��ʼ��ʾͼƬ...");
				// ����ǰ�ȵ��������߳̽�ͼƬ�������
				try {
					/*
					 * ��show�߳�ִ��download.join()������ show�߳̾ͽ���������״̬��ֱ��download
					 * �߳�ֹͣ��Ż���������
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// ͼƬ��û������������׳��쳣
				if (!isFinish) {
					/*
					 * ��һ���쳣�׳���run����֮�⣬��ζ�� ����߳̾�ֹͣ��(ʵ�ʿ����о������� ������)��
					 */
					throw new RuntimeException("ͼƬ����ʧ��!");
				}
				System.out.println("show:��ʾͼƬ���!");
			}
		};
		download.start();
		show.start();

	}
}
