package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * ��ɼ��׼��±�����
 * ����������Ҫ�������ļ�����Ȼ��Ը��ļ�д������
 * ֮�������ÿһ���ַ���������д�뵽���ļ��С�
 * ������"exit"ʱ�����˳���
 * 
 * ʹ��PW��ɸù��ܣ���������ʹ����������ɡ�
 * @author adminitartor
 *
 */
public class Note {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ���:");
		String filename = scanner.nextLine();
		/*
		 * ������PWʱ��һ������Ϊһ����ʱ����ô�Ϳ���
		 * �ٴ���һ��booleanֵ���͵Ĳ���������ֵΪtrue
		 * ��ô��ǰPW�;������Զ���ˢ�¹��ܣ�����ÿ��
		 * ʹ��println����д��һ���ַ�����ͻ��Զ�flush
		 * 
		 * ע:ʹ���Զ���ˢ�¿������д�����ݵļ�ʱ�ԣ���
		 * �����ڻ����д����������Ȼ�ᵼ��дЧ�ʽ��͡�
		 */
		PrintWriter pw = new PrintWriter(
			new BufferedWriter(
				new OutputStreamWriter(
					new FileOutputStream(filename),
					"UTF-8"
				)	
			),true
		);
		System.out.println("�뿪ʼ��������:");
		while(true){
			String line = scanner.nextLine();
			if("exit".equals(line)){
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("�ټ�!");
		pw.close();
	}
}












