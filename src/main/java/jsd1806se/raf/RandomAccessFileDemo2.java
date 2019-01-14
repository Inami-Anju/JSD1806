package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF����ָ��Ķ�д�����Լ�RAF��д�����������ݵĲ���
 * @author adminitartor
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.dat", "rw");
		/*
		 * ��ȡraf��ǰָ��λ�ã�RAF�մ���ʱ�����ļ���
		 * ��ʼ����Ӧ��λ��Ϊ0.
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		
		/*
		 * ���ļ���д��һ��int���ֵ
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 * 
		 * max>>>24
		 * 00000000 00000000 00000000 01111111
		 */
		int max = Integer.MAX_VALUE;		
		raf.write(max>>>24);
		System.out.println("pos:"+raf.getFilePointer());
		
		
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max);
		System.out.println("pos:"+raf.getFilePointer());
		
		
		/*
		 * void writeInt(int d)
		 * ��������intֵ��4���ֽ�һ����д���ļ�����ͬ
		 * �����4��write����
		 */
		raf.writeInt(max);
		System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * RAF�ṩ�����л������͵�д������
		 */
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		
		System.out.println("д�����!");
		
		/*
		 * ����ָ��
		 * 
		 * void seek(long pos)
		 * ��ָ���ƶ���ָ��λ��
		 * 
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * rafҲ�ṩ�˶�ȡ�������͵���ط���
		 */
		int d = raf.readInt();
		System.out.println(d);//max
		System.out.println("pos:"+raf.getFilePointer());
		
		//��ȡlong
		//1��ָ���ƶ���long�ĵ�һ���ֽ�λ��
		raf.seek(8);
		//2������ȡ8���ֽ�
		long l = raf.readLong();
		System.out.println(l);
		
		double dou = raf.readDouble();
		System.out.println(dou);
		//ָ��Ӧ���ٴε����ļ�ĩβ
		System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * ������readInt�����ķ��������з��ֶ�ȡ�����ļ�
		 * ĩβʱ�����׳�EOFException��ʾ�ļ�ĩβ��
		 * EOF end of file
		 */
//		d = raf.readInt();
//		System.out.println(d);
		
		raf.close();
	}
}














