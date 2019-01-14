package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * java.io.PrintWriter
 * �����Զ���ˢ�µĻ����ַ���������ص��ǿ��԰���д��
 * �ַ��������ҿ����Զ���ˢ�¡�
 * 
 * ע:
 * java.io.BufferedWriter�ǻ����ַ���������ڲ��л�����
 * ���Խ��п�д�������Ч�ʣ���PrintWriter����ͨ��������
 * ʵ�ֵĻ��幦��(PW�ĺܶ๹�췽���ڲ��Զ�������)��
 * 
 * @author adminitartor
 *
 */
public class PWDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * PW֧������ֱ�Ӷ��ļ�д�����Ĺ��췽��:
		 * PrintWriter(File f)
		 * PrintWriter(String path)
		 * 
		 * �������ֹ��췽����֧��һ�����أ������ٴ���һ������
		 * ��������ָ��д���ַ�ʱ���ַ���
		 * 
		 */
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		
		pw.println("�����Ϸ����������ѩ�׷ɡ�");
		pw.println("���ڱ����ĺ�ҹ��ļ��紺��");
		
		System.out.println("д�����!");
		pw.close();
		
	}
}









