package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ������߶�дЧ�ʣ�����ͨ�����ÿ��ʵ�ʶ�д��������
 * ����ʵ�ʶ�д�������ﵽ��
 * 
 * ���ֽڶ�д��Ϊ�����д��ʽ
 * һ�ζ�дһ���ֽڳ�Ϊ���д��ʽ
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		//1
		RandomAccessFile src
			= new RandomAccessFile("movie.avi", "r");
		//2
		RandomAccessFile desc
			= new RandomAccessFile("movie_cp2.avi","rw");		
		/*
		 * RAF�ṩ�Ŀ��д����:
		 * int read(byte[] data)
		 * һ���Դ��ļ��ж�ȡ���������鳤�ȵ��ֽ�������
		 * ���뵽�������У�����ֵΪʵ�ʶ�ȡ�����ֽ�����
		 * ������ֵΪ-1����ʾ����û�ж�ȡ���κ�����(ʵ��
		 * ���Ѿ����ļ�ĩβ��)
		 * 
		 * void write(byte[] data)
		 * һ���Խ��������ֽ������������ֽ�д��
		 * 
		 * void write(byte[] data,int index,int len)
		 * һ���Խ��������ֽ�������index����ʼ������
		 * len���ֽ�д��
		 */
		int len = -1;//��ʾÿ��ʵ�ʶ�ȡ�����ֽ���
		byte[] data = new byte[1024*10];//10k
		
		long start = System.currentTimeMillis();
		while((len = src.read(data))!=-1){
			desc.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("�������!��ʱ:"+(end-start)+"ms");
		
		src.close();
		desc.close();
	}
}













