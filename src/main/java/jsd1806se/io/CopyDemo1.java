package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�������ļ��ĸ��Ʋ���
 * @author adminitartor
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * ����:
		 * 1:�����ļ����������ڶ�ȡԭ�ļ�
		 * 2:�����ļ����������д�����ļ�
		 * 3:˳���ԭ�ļ���ȡ�ֽڲ�д�뵽�����ļ���
		 *   ��ɸ��Ʋ�����
		 */
		FileInputStream fis	
			= new FileInputStream("movie.avi");
		FileOutputStream fos	
			= new FileOutputStream("movie_cp3.avi");
		byte[] data = new byte[1024*10];//10k
		int len = -1;
		while((len = fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("�������");
		fis.close();
		fos.close();
	}
}









