package collection;
/**
 * ����Ӧ��
 * @author adminitartor
 *
 */
public class TypeDemo2 {
	public static void main(String[] args) {
		/*
		 * Type�е�x,y���Ƿ���<T>�������͵�ʵ��������
		 * Object������x,yʵ���Ͼ���Object����
		 *
		 * ��ʹ��ʱ,ָ��TΪInteger,��ô������������������
		 * ����x,y��ֵʱ��ʵ��ֵ�������Ƿ����Ҫ��
		 * �����ڻ�ȡ���ǵ�ֵʱ�����������Զ�������ʹ���
		 */
		Type<Integer> t = new Type<Integer>(1,2);
		//����������ʵ���Ƿ����㷺����ָ�����͵�Ҫ��
		t.setX(2);
		//��ȡʱ����������(���������Զ���ȫ)
		int x = t.getX();
		System.out.println("x:"+x);
		System.out.println(t);
		
		Type<Double> t2 = new Type<Double>(1.1,2.2);
		t2.setX(2.2);
		double x2 = t2.getX();
		System.out.println("x2:"+x2);
		System.out.println(t2);
		
		Type<String> t3 = new Type<String>("һ","��");
		t3.setX("��");
		String x3 = t3.getX();
		System.out.println("x3:"+x3);
		System.out.println(t3);
	}
}









