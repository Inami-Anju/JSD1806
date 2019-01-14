package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ļ���д���ַ�������
 * @author adminitartor
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt", "rw");
		String line = "��һ�ź��ݺ��ݺ��ݺ���~";
		/*
		 * ���ַ������ȸ��ݸ������ַ���ת��Ϊһ���ֽ�
		 * ������֧�����ĵ��ַ�����:
		 * GBK,UTF-8
		 */
		byte[] data = line.getBytes("UTF-8");
		raf.write(data);
		
		raf.write("���Ʈҡ~".getBytes("UTF-8"));
		System.out.println("д�����!");
		raf.close();
	}
}





