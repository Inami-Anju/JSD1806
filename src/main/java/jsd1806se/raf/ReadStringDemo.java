package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ַ���
 * @author adminitartor
 *
 */
public class ReadStringDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ��note.txt�ļ��е������ַ���ȡ����
		 */
		RandomAccessFile raf 
			= new RandomAccessFile("note.txt", "r"); 		
		/*
		 * �����ȡһ���ַ���Ӧ����ȡ�����ֽ�?
		 * ��ͬ���ַ�������Ӧ������ռ�õ��ֽ����ǲ�ͬ��
		 * Ӣ������ͬ�ģ������ĸ��ַ�������1�ֽڣ�����
		 * ��asc����Ĳ��֡����Ƕ������Ķ�����Ȼ��
		 * ��GBK�����У�ÿ��������ռ��2�ֽڣ���utf-8��
		 * ÿ��������ռ��3���ֽڡ�
		 * ռ�õ���Щ�ֽڶ�Ӧ��2���Ʋ�ȫ�Ǳ���ַ������
		 * ���ݣ��������㷨(ͨ���������֪Ӧ����ȡ����
		 * �ֽڱ�ʾһ������)��
		 */
		/*
		 * ����һ�����ļ�һ������ֽ�����(���ļ�����
		 * ���ʺ�������)
		 */
		byte[] data = new byte[(int)raf.length()];
		//��ȡָ�����ֽ���(������ڽ��ļ������ֽڶ���)
		raf.read(data);
		/*
		 * String�Ĺ��췽���������ǽ�ָ�����ֽ�������
		 * ���е��ֽڰ��ո������ַ���ת��Ϊһ���ַ���
		 */
		String string = new String(data,"UTF-8");
		System.out.println(string);
		
		raf.close();
	}
}













