package exception;
/**
 * finally��
 * finally���Ƕ������쳣������Ƶ����һ�顣������ֱ��
 * ����try֮��������һ��catch֮��
 * finally���Ա�ֻ֤Ҫ����ִ�е���try�鵱�У���ô����
 * try���е�����Ƿ���׳��쳣�� finally��ȷ��������һ��
 * ��ִ�С�ͨ���Ὣ�ͷ���Դ�Ȳ�������finally�У�������
 * �رղ�����
 *
 * @author adminitartor
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String string = "";
			System.out.println(string.length());
			return;
		} catch (Exception e) {
			System.out.println("������!");
		} finally{
			System.out.println("finally���еĴ���ִ����!");
		} 
	
		System.out.println("���������");
	}
}








