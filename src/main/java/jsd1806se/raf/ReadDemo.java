package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ļ��ж�ȡһ���ֽ�
 * @author adminitartor
 *
 */
public class ReadDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile("test.dat", "r");
		/*
		 * int read()
		 * ���ļ��ж�ȡ1���ֽڣ�����int��ʽ���ء�������
		 * ֵΪ-1�����ʾ�ļ���ȡ��ĩβ��
		 * 00000000 00000000 00000000 00000001
		 */
		int d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);
		
		raf.close();
		
	}
}












