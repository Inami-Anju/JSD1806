package string;
/**
 * �ַ���ƴ�Ӵ�������������
 * @author adminitartor
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String string = "a";
		for(int i=0;i<10000000;i++){
			string += string;
		}
		System.out.println("ִ�����!");
	}
}









