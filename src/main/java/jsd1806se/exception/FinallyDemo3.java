package exception;
/**
 * finally����������
 * 
 * ��ֱ�˵��:final,finally,finalize
 * finalize��Object����ķ������÷����Ǳ�GCִ�еķ�����
 * ��һ�����󼴽���GC�ͷ�ǰ��GC����ø÷��������ø÷���
 * ��Ϻ���ζ�Ÿö��󼴱��ͷš�
 * 
 * @author adminitartor
 *
 */
public class FinallyDemo3 {
	public static void main(String[] args) {
		System.out.println(
			test("0")+","+test(null)+","+test("")	
		);
		// ?,?,?
	}
	
	public static int test(String str){
		try {
			System.out.println("��ʼִ��test");
			return str.charAt(0)-'0';
		} catch (NullPointerException e) {
			System.out.println("�����˿�ָ��");
			return 1;
		} catch (Exception e){
			System.out.println("�����������쳣");
			return 2;
		} finally{
			System.out.println("finallyִ����");
			return 3;
		}
		
	}
}











