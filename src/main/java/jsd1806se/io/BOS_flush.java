package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������Ļ���������
 * @author adminitartor
 *
 */
public class BOS_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		String line = "���Ǹ��ڵ�̩ɽ��ץס���������������˵!�~~~~~";		
		byte[] data = line.getBytes("UTF-8");
		
		bos.write(data);
		/*
		 * void flush()
		 * ��������flush��������ǿ�ƽ����������ѻ����
		 * ���ݽ���һ����д����
		 * Ƶ���ĵ���flush�����ή��дЧ�ʣ������ܱ�֤
		 * д�����ݵļ�ʱ�ԡ�
		 */
//		bos.flush();
		System.out.println("д�����!");
		//�������ڹر�ʱ���Զ�����һ��flush����
		bos.close();
		
	}
}












