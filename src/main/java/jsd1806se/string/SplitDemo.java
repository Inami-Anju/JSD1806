package string;
/**
 * �ַ���֧��������ʽ������:
 * String[] split(String regex)
 * ����ǰ�ַ�����������������ʽ�Ĳ��ֽ��в�֣�������
 * ��ֺ������
 * @author adminitartor
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String line = "abc123def456ghi789jkl";
		/*
		 * �������ֲ��ֲ��
		 * �ڲ�ֹ�����������ƥ�����������Բ�����ݣ���ô
		 * �м�ͻ��ֳ�һ�����ַ��������������ַ���ĩβ
		 * ����ƥ�䣬��ô���в�ֳ����Ŀ��ַ���������ԡ�
		 */
		String[] arr = line.split("[0-9]+");
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}









