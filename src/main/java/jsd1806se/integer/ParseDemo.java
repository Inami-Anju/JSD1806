package integer;
/**
 * ��װ�඼�ṩ��һ����̬����:parseXXX(String line)
 * ����������Խ��������ַ���ת��Ϊ��Ӧ�Ļ������ͣ�ǰ��
 * �Ǹ��ַ���������ȷ�����û������Ϳ��Ա����ֵ��
 * @author adminitartor
 *
 */
public class ParseDemo {
	public static void main(String[] args) {
		String string = "123";
		
		int a = Integer.parseInt(string);
		System.out.println(a);//123
		
		double d = Double.parseDouble(string);
		System.out.println(d);//123.0
	}
}










