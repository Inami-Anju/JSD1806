package string;
/**
 * �ַ���֧��������ʽ�ķ�����:
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�����ַ�����
 * @author adminitartor
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args) {
		String line = "abc123def456ghi789jkl";
		/*
		 * ����ǰ�ַ����е����ֲ����滻Ϊ#NUMBER#
		 */
		line = line.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(line);
	}
}











