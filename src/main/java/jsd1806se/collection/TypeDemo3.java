package collection;
/**
 * �����Ǳ������Ͽɣ�����������Ͽ�
 * @author adminitartor
 *
 */
public class TypeDemo3 {
	public static void main(String[] args) {
		Type<Integer> t1 = new Type<Integer>(1,2);
		//����������ʵ�������Ƿ���Ϸ���Ҫ��
		t1.setX(3);
		//���������Զ��������ͻ�Integer�Ĵ���
		int x1 = t1.getX();
		System.out.println("x1:"+x1);
		System.out.println("t1:"+t1);		
		//����ָ������ʱ��������Ĭ����Ϊ��ԭ��Object
		Type t2 = t1;
		System.out.println("t2:"+t2);		
		t2.setX("һ");
		System.out.println("t2:"+t2);		
		//�������쳣!
		x1 = t1.getX();
		System.out.println("x1:"+x1);
		System.out.println("t1:"+t1);
		
	}
}









