package date;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ȷ�е�ʱ��㡣�ڲ�ά��
 * һ��longֵ����ֵ��UTCʱ��(1970��1��1��00:00:00)��
 * ��ǰDate��ʾ��ʱ��֮���������ĺ��롣
 * 
 * ����Date����ʱ���Լ�ǧ������⣬���Դ󲿷ֵķ�����
 * JDK1.1�汾�Ƴ�ʱ�ͱ�����Ϊ��ʱ�ģ�����Щ����ʱ���
 * ��������Calendar����ط���ȡ����
 * @author adminitartor
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		//Ĭ�ϴ�����ʾ��ǰϵͳʱ��
		Date date = new Date();
		
		System.out.println(date);
		
//		date.getYear();
		/*
		 * long getTime()
		 * ��ȡDate�ڲ�ά����longֵ
		 */
		long time = date.getTime();
		System.out.println(time);
		
		time = time+1000*60*60*24;
		/*
		 * void setTime(long time)
		 * ����һ��longֵ��ʹDate��ʾ������
		 */
		date.setTime(time);
		System.out.println(date);
		
	}
}









