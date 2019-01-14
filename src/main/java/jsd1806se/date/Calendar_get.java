package date;

import java.util.Calendar;

/**
 * Calendar���Ի�ȡ����ʱ�������ֵ
 * int get(int field)
 * ��ͬ��ʱ������ò�ͬ�����ֱ�ʾ����Щ����������䣬
 * Calendar���ṩ�˶�Ӧ�ĳ���
 * @author adminitartor
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//��ȡ��
		int year = calendar.get(Calendar.YEAR);
		//��ȡ��(�´�0��ʼ)
		int month = calendar.get(Calendar.MONTH)+1;
		/*
		 * ��ȡ��
		 * ��"��"��صĳ�����:
		 * DAY_OF_WEEK   ���е���
		 * DAY_OF_MONTH  ���е���
		 * DAY_OF_YEAR   ���е��� 
		 * DATE          ���е��죬��DAY_OF_MONTHһ��
		 */
		int day = calendar.get(Calendar.DAY_OF_MONTH);
//		int day = calendar.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);
		
		/*
		 * ��ȡʱ����
		 */
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
	
		//�ܼ�?
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		String[] data = {"��","һ","��","��","��","��","��"};
		System.out.println("��"+data[dow-1]);
		
		//����ĵڼ���?
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�"+doy+"��");
		//��ȡ����ʱ���������������ֵ
		int days = calendar.getActualMaximum(
			Calendar.DAY_OF_YEAR);
		System.out.println("���깲"+days+"��");
		
		
		
	}
}












