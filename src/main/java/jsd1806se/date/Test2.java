package date;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * ������Ʒ�Ĵ�������
 * 
 * ����������Ҫ���û�����ĳ��Ʒ����������:yyyy-MM-dd
 * �Լ������ڵ�����
 * Ȼ�󾭹�������㣬�������Ʒ�Ĵ�������:yyyy-MM-dd
 * 
 * �������ڹ���:��Ʒ������ǰ���ܵ�����
 * @author adminitartor
 *
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������:");
		String dateStr = scanner.nextLine();		
		System.out.println("�����뱣��������:");
		int days = Integer.parseInt(scanner.nextLine());		
		//�Ƚ���������ת��ΪDate
		SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd"
		);
		Date date = sdf.parse(dateStr);
		//ʹCalendar��ʾ��������
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//���������
		calendar.add(Calendar.DAY_OF_YEAR, days);
		//����ǰ����
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		//����Ϊ���ܵ�����
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		//�õ���������
		date = calendar.getTime();
		System.out.println("����Ʒ�Ĵ�����Ϊ:"+sdf.format(date));
		
		
	}
}










