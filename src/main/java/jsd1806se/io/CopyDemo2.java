package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��������Ҳ��:�߼���
 * ��IO�����У�ͨ�����ǻ��ڵͼ���������һЩ�߼���������
 * ������������Щ�߼���ʱ�����ǿ��Զ����ݽ�����Ӧ�ļӹ�
 * �����Լ����Ƕ����ݵ���ز�������������̣���Ϊ
 * �����Ӳ�����
 * 
 * ������
 * ��������һ�Ը߼�������������߶�дЧ�ʡ�
 * �������ڲ�ά��һ�����飬���������������д���ǿ��д
 * ���������ն�������������ʱ�ı�Ϊ���д�������Ӷ����
 * �˶�дЧ�ʡ�
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis	 
			= new FileInputStream("movie.avi");
		//��߶�ȡЧ�ʣ��������ӻ���������
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		
		
		FileOutputStream fos 
			= new FileOutputStream("movie_cp4.avi");
		//���ӻ����ֽ���������д��Ч��
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		int d = -1;
		
		while((d = bis.read())!=-1){
			bos.write(d);
		}
		
		System.out.println("�������!");
		/*
		 * �ر�����ʱ��ֻ��Ҫ�ر������߼������ɡ�
		 * 
		 */
		bis.close();
		bos.close();
	}
}













