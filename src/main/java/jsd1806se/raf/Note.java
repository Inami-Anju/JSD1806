package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * ���׼��±�����
 * 
 * ����������Ҫ���û�����һ���ļ������֣�Ȼ��Ը�
 * �ļ�����д������
 * ֮���û��ڿ���̨�����ÿ���ַ�����˳��д�뵽���ļ�
 * �С�
 * ���û�����"exit"ʱ�������˳���
 * @author adminitartor
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ���:");
		String fileName = scanner.nextLine();		
		RandomAccessFile raf
			= new RandomAccessFile(fileName, "rw");	
		System.out.println("�뿪ʼ��������:");	
		while(true){
			String line = scanner.nextLine();
			if("exit".equals(line)){
				break;
			}
			raf.write(line.getBytes("UTF-8"));
		}		
		System.out.println("�ټ�!");
		raf.close();
		
	}
}










