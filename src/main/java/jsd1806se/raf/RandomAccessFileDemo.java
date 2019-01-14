package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ר��������д�ļ����ݵ��࣬���д�ǻ���ָ����еģ���:
 * RAF������ָ��ָ��λ�ö�ȡ����д���ֽڡ�
 * 
 * RAF�����ֳ��õ�ģʽ:
 * r:ֻ��ģʽ��ֻ�ܶ�ȡ�ļ����ݣ���������д������
 * rw:��дģʽ�����ɶ�Ҳ��д��
 * @author adminitartor
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ����ĿĿ¼�µ��ļ�test.dat�ļ����ж�д����
		 * 
		 * RandomAccessFile(String path, String mode)
		 * RandomAccessFile(File file, String mode)
		 * 
		 */
		RandomAccessFile raf 
			= new RandomAccessFile("test.dat", "rw");
		System.out.println("raf�Ѵ���!");
		
		
		/*
		 * void write(int d)
		 * �÷����������ļ���д��һ���ֽڣ�д�����
		 * ������intֵ����Ӧ��2���Ƶ�"�Ͱ�λ". 
		 *                            vvvvvvvv
		 * 00000000 00000000 00000001 00000001
		 */
		raf.write(1);		
		System.out.println("д�����!");
		
		raf.close();
		
	}
}














