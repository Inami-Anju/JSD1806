package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar ������
 * Calendar������һ�������࣬������ʵ�����������ṩ��
 * һ��ʵ�ֵľ�̬����:getInstance�����Ը��ݵ�ǰϵͳ����
 * ������ȡһ�����õ�ʵ����ʵ�����󲿷ֶ�ȡ��ȡ�����Ķ�
 * ��GregorianCalendar����:����
 * 
 * @author adminitartor
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		//��ȡ��CalendarĬ�ϱ�ʾ��ǰϵͳʱ��
		Calendar calendar = Calendar.getInstance();
		//Calendar��toString����ֱ�۷�ӳ�������ʾ������
		System.out.println(calendar);
		/*
		 * Date getTime()
		 * Calendar��getTime�������Խ����ʾ��ʱ����
		 * һ��Dateʵ����ʽ���ء�
		 * Calendar->Date
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * void setTime(Date date)
		 * ʹ��ǰCalendar��ʾ������Date����ʾ������
		 * Date->Calendar
		 */
		calendar.setTime(date);
		
		
	}
}








