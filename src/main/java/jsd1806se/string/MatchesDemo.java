package string;
/**
 * �ַ���֧��������ʽ����һ:
 * boolean matches(String regex)
 * ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ������ʽҪ��
 * ��Ҫע�⣬����������ʽ�����Ƿ���˱߽�ƥ���(^...$)
 * ������ȫƥ����֤
 * @author adminitartor
 *
 */
public class MatchesDemo {
	public static void main(String[] args) {
		String mail = "fancq@tedu.cn";
		/*
		 * �����������ʽ:
		 * \w+@\w+(\.[a-zA-Z]+)+
		 * 
		 */
		String regex = "\\w+@\\w+(\\.[a-zA-Z]+)+";
		
		boolean check = mail.matches(regex);
		if(check){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
		
	}
}











