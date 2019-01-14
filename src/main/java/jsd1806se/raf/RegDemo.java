package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ���ע���û�����
 * ����������Ҫ���û�����:�û��������룬�ǳƣ�����
 * Ȼ�󽫸ü�¼д��user.dat�ļ��С�
 * 
 * �滮ÿ����¼ռ��100�ֽ�
 * ����:�û��������룬�ǳ�Ϊ�ַ�������ռ32�ֽ�
 * ����Ϊintֵ��ռ4���ֽ�
 * 
 * �ַ���ͨ�������ʱ��������⡰���ס���������Թ̶���
 * �������ô��ǣ���һ:��ʽͳһ�����ڲ���ָ���ȡÿ����¼
 * �ڶ�:����һ���������������޸�
 * 
 * @author adminitartor
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = scanner.nextLine();
		
		System.out.println("����������:");
		String password = scanner.nextLine();
		
		System.out.println("�������ǳ�:");
		String nickname = scanner.nextLine();
		
		System.out.println("����������:");
		int age = Integer.parseInt(
			scanner.nextLine()
		);
		
		RandomAccessFile raf
			= new RandomAccessFile("user.dat", "rw");
		//��ָ���ƶ����ļ���ĩβ
		raf.seek(raf.length());
		
		
		//д�û���
		//1 �Ƚ��û���ת��Ϊһ���ֽ�
		byte[] data = username.getBytes("UTF-8");
		//2 ��ת�����ֽ��������ݵ�32���ֽ�
		data = Arrays.copyOf(data, 32);
		//3 ���ֽ�����д���ļ�
		raf.write(data);
		
		//д����
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//д�ǳ�
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//д����
		raf.writeInt(age);
		System.out.println("ע�����!");
		raf.close();
	}
}	













