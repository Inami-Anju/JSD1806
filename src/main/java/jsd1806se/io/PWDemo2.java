package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ����������ʹ��PW
 * @author adminitartor
 *
 */
public class PWDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * ʹ����������ʽ���ļ���д���ַ���
		 */
		FileOutputStream fos
			= new FileOutputStream("pw2.txt");		
		OutputStreamWriter osw
			= new OutputStreamWriter(fos, "UTF-8");		
		BufferedWriter bw
			= new BufferedWriter(osw);		
		PrintWriter pw
			= new PrintWriter(bw);
		
		pw.println("���!");
		pw.println("�ټ�!");
		
		pw.close();
	}
}








