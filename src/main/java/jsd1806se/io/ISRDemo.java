package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ����ת���������ַ�����ȡ�ַ�����
 * @author adminitartor
 *
 */
public class ISRDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("osw.txt");		
		InputStreamReader isr
			= new InputStreamReader(fis,"UTF-8");
		int d = -1;
		/*
		 * �ַ����ṩ�Ķ�ȡ�ַ�����:
		 * int read()
		 * �÷�����һ�ζ�ȡһ���ַ�������ʵ�ʶ�ȡ�˶���
		 * �ֽ�ȡ����ָ�����ַ����Լ���Ӧ���ַ�(�ַ���
		 * �������ж�)��
		 * ��ȡ�ַ�������int��ʽ���أ�����ֵΪ-1��Ȼ��
		 * ʾ����ȡ����ĩβ����������ݱ�ʾ�ľ��Ƕ�ȡ����
		 * ��Ӧ�ַ���ת��Ϊchar���ɡ�
		 * 
		 */
		while((d = isr.read())!=-1){
			char c = (char)d;
			System.out.print(c);
		}
		isr.close();
		
	}
}








