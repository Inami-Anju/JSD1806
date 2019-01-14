package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ����������ص�:���԰��ж�ȡ�ַ���
 * @author adminitartor
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ����ǰ�����Դ�������������̨
		 */
		FileInputStream fis
			= new FileInputStream("src/io/BRDemo.java");
		InputStreamReader isr
			= new InputStreamReader(fis,"GBK");
		BufferedReader br
			= new BufferedReader(isr);
		/*
		 * String readLine()
		 * ������ȡ�����ַ���ֱ����ȡ�˻��з�Ϊֹ��Ȼ��
		 * �����з�֮ǰ�������ַ����һ���ַ������أ�ע��
		 * ���ص��ַ����в���������ȡ���Ļ��з���
		 * ����ȡ����ĩβ���򷵻�null��
		 */
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
	}
}












