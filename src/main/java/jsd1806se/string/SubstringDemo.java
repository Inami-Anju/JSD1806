package string;
/**
 * String substring(int start,int end)
 * ��ȡ��ǰ�ַ�����ָ����Χ�ڵ��ַ�������API����һ��
 * �ص㣬����ʹ���������ֱ�ʾ��Χʱ��ͨ������"��ͷ����β"
 * �ġ�
 * @author adminitartor
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
		//            0123456789012
		String str = "www.baidu.com";
		
		//��ȡ����
		String sub = str.substring(4,9);
		System.out.println(sub);
		
		//һ�����������Ǵ�ָ��λ�ý�ȡ��ĩβ
		sub = str.substring(4);
		System.out.println(sub);
	}
}











