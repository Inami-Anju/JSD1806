package integer;
/**
 * java��8���������ͣ��������ǲ��߱������������ԣ�����
 * ����ֱ�Ӳ���������󿪷�,��ô��ʵ��ʹ���ϻ���ֺܶ��
 * ���㣬Ϊ��javaΪ8�����������ṩ�˶�Ӧ�İ�װ�࣬�Ա���
 * �û��������Զ�����ʽ���ڲ������������Ŀ�����
 * @author adminitartor
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//����ͨ��ʵ��������������ת��Ϊ��Ӧ�İ�װ��
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(1);
		
		//�Ƽ�ʹ�þ�̬����valueOf����������תΪ��װ��
		Integer i1 = Integer.valueOf(128);
		Integer i2 = Integer.valueOf(128);
		
		System.out.println(i1==i2);//true
		System.out.println(i1.equals(i2));//true
		
		/*
		 * �������͵İ�װ���ṩ��һ�鷽��:
		 * intValue,doubleValue,floatValue�ȵ�
		 * ���Խ���ǰ��װ���ʾ������ת��Ϊ��Ӧ�Ļ���
		 * ���͡�
		 */
		int d = i1.intValue();
		System.out.println(d);
		
		double dou = i1.doubleValue();
		System.out.println(dou);
		
		byte b = i1.byteValue();
		System.out.println(b);
		
		
		//��ȡint���ֵ?
		int imax = Integer.MAX_VALUE;
		System.out.println(imax);
		int imin = Integer.MIN_VALUE;
		System.out.println(imin);
	
		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);
	}
}









