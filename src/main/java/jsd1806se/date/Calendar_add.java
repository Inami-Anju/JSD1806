package date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * �Ը�����ʱ��������ϸ�����ֵ����������ֵΪ����������
 * ��ȥ��Ӧ��ֵ
 * @author adminitartor
 *
 */
public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * 3��2������25���Ժ����������ܵ�����������?
		 */
		//����3��
		calendar.add(Calendar.YEAR, 3);
		//����2����
		calendar.add(Calendar.MONTH, 2);
		//����25��
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());	
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		
		System.out.println(calendar.getTime());
	}
}










