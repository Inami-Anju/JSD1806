package exception;
/**
 * �쳣�����ķ���
 * @author adminitartor
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String string = "a";
			int a = Integer.parseInt(string);
		} catch (Exception e) {
			System.out.println("�����ˣ�");
			//���������Ϣ���������ҵ����������
//			e.printStackTrace();
			
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("���������");
	}
}




