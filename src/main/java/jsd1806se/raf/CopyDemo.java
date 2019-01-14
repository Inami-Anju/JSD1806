package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �ļ����Ʋ���
 * @author adminitartor
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1:����һ��RAF���ڶ�ȡԭ�ļ�
		 * 2:����һ��RAF����д�븴���ļ�
		 * 3:ѭ����ԭ�ļ���ȡÿһ���ֽڲ�д�뵽�����ļ�
		 *   �����copy����
		 */
		//1
		RandomAccessFile src
			= new RandomAccessFile("movie.avi", "r");
		//2
		RandomAccessFile desc
			= new RandomAccessFile("movie_cp.avi","rw");
		//3
		int d = -1;
		long start = System.currentTimeMillis();
		while((d = src.read())!=-1){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("�������!��ʱ:"+(end-start)+"ms");
		src.close();
		desc.close();
		
	}
}







