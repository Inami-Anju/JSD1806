package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ���԰���һ��ָ�������ڸ�ʽ��Date��String�����໥ת����
 * @author adminitartor
 *
 */
public class SimpleDateFormat_format {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		/*
		 * 2018-08-21 10:31:22
		 * yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
		/*
		 * String format(Date date)
		 * ��������Date���յ�ǰSDFָ�������ڸ�ʽת��
		 * Ϊ�ַ���
		 * 
		 */
		String line = sdf.format(date);
		System.out.println(line);
	}
}









