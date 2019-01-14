package exception;
/**
 * �쳣��������е�try-catch
 * �﷨����:
 * try{
 * 	���ܳ����쳣�Ĵ���Ƭ��
 * }catch(XXXException e){
 *  ����try�г��ֵ�XXXException��Ĵ����������
 * }
 * @author adminitartor
 *
 */
public class Try_CatchDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		
		try{
			String string  = "a";
			System.out.println(string.length());
			
			System.out.println(string.charAt(0));
			
			System.out.println(Integer.parseInt(string));
			/*
			 * ��try���г���������µĴ��붼���ᱻִ��
			 */
			System.out.println("!!!!!!");
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ��!");
		
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�ַ����±�Խ���ˣ�");
		/*
		 * Ӧ����һ����ϰ�ߣ������һ��catch������Exception
		 * ��ֹһ��δ������쳣���³����жϡ�
		 */
		}catch(Exception e){
			System.out.println("�������ǳ��˸���!");
		}
		
		System.out.println("���������");
	}
}










