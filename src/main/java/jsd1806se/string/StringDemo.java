package string;

import java.security.acl.Permission;

/**
 * �ַ������Ż�:
 * �ַ��������أ�JVM���ڴ��д�����һ������������������
 * �Ѿ�ͨ��������(ֱ����)�������ַ�������һ���ٴη���
 * ͨ���������������ַ�������ʱ��ֱ��������ǰ����ģ���
 * �����ٴ���ʵ�����ö��󣬴Ӷ���ʡ���ڴ�Ŀ�����
 * 
 * @author adminitartor
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";
		String s2 = "123abc";
		String s3 = "123abc";
		
		//s2,s3������s1�������ַ�������
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		/*
		 * �ַ�����Ҫ�����ַ���Ϊ������󣬼�:һ������
		 * ���ݲ��ɱ䣬���ı�һ�������¶���
		 */
		s1 = s1+"!";
		System.out.println(s1);
		
		System.out.println(s1==s2);//false
		
		/*
		 * newһ���ᴴ���¶������Բ�Ӧ��ʹ��"=="�ж�
		 * �ַ�������Ӧ��ʹ��equals
		 */
		String s4 = new String("123abc");
		System.out.println(s2==s4);//false
		System.out.println(s2.equals(s4));//true
		
		
		/*
		 * ��������һ���Ż���ʩ��������������һ������
		 * ���ʽ�м���������߶���������ʱ����ֱ�ӽ�
		 * �м��㣬����������뵽class�ļ��С�
		 * ��������Ĵ��룬�ᱻ��������Ϊ:
		 * String s5 = "123abc";
		 */
		String s5 = "123"+"abc";
		System.out.println(s2==s5);//true
		
		String s = "123";
		String s6 = s + "abc";
		System.out.println(s2==s6);//false
		
		
	}
}










