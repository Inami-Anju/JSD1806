package string;
/**
 * �ַ����ṩ��һ�龲̬�ķ���:valueOf
 * ���Խ���������ת��Ϊ�ַ��������õ��ǽ���������ת��
 * Ϊ�ַ�����
 * @author adminitartor
 *
 */
public class ValueOfDemo {
	public static void main(String[] args) {
		int i = 123;
		String iString = String.valueOf(i);
		System.out.println(iString);
		
		iString = i+"";//�κ��������ַ������ӽ�������ַ���
		
		
		double d = 123.123;
		String dString = String.valueOf(d);
		System.out.println(dString);
		
		
	}
}










