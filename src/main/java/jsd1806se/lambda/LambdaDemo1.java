package lambda;
/**
 * lambda���ʽ
 * JDK1.8֮���Ƴ���һ�������ԣ����Ը����Ĵ��������ڲ���
 * ʹ��lambda���������ڲ���ʱҪ��ýӿڱ����ж���ֻ����
 * һ�����󷽷�ʱ�ſ���ʹ�á�
 * 
 * lambda�﷨:
 * (�����б�)->{
 *   ������
 * }
 * ʹ��lambda����ָ��ʵ�ֵĽӿڣ��Լ���д��������������
 * ��ϵ�ǰԴ��������Զ��б�ע�⣬lambdaҲ�Ǳ������Ͽ�
 * ���ջᱻ��������Ϊ��ͳ��ʽ������
 * @author adminitartor
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		//�����ڲ�����ʽ����
		Runnable r1 = new Runnable(){
			public void run(){
				System.out.println("hello");
			}
		};
		//lambda��ʽ����
		Runnable r2 = ()->{
			System.out.println("hello");
		};
		
		/*
		 * ���������ֻ��һ����룬��ô�÷�����"{}"����
		 * ʡ��
		 */
		Runnable r3 = ()->System.out.println("hello");
		
	}
}


















