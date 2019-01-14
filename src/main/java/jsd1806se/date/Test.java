package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ����������Ҫ���û������Լ�������:yyyy-MM-dd
 * Ȼ�󾭹�������㣬���������Ϊֹһ�����˶�����
 * ����������10000��ļ�����������.��ʽ:yyyy-MM-dd
 * 
 * 
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������:");
		String birthStr = scanner.nextLine();	
		SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd"	
		);
		//����
		Date birth = sdf.parse(birthStr);
		//����
		Date now = new Date();
		//�����ĺ���
		long time = now.getTime()-birth.getTime();
		//�������
		time = time/1000/60/60/24;
		System.out.println("��ϲ�����Ѿ�����"+time+"�죡���������!");
	
		//���յĺ���
		time = birth.getTime();
		//��10000��ĺ���
		time = time + 1000 * 60 * 60 *24 * 10000L;
		Date date = new Date(time);
		System.out.println("����10000��ļ�����Ϊ:"+sdf.format(date));
	}
}











