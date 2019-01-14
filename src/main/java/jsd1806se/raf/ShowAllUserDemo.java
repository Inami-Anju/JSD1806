package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Date;

/**
 * ��ʾuser.dat�ļ��������û���Ϣ
 * @author adminitartor
 *
 */
public class ShowAllUserDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("user.dat", "r");		
		for(int i=0;i<raf.length()/100;i++){
			//���û���
			//������ȡ32�ֽڣ�����ת��Ϊ�ַ���
			byte[] data = new byte[32];
			raf.read(data);
			String username = new String(data,"UTF-8").trim();
			
			//������
			raf.read(data);
			String password = new String(data,"UTF-8").trim();
			
			//���ǳ�
			raf.read(data);
			String nickname = new String(data,"UTF-8").trim();
			
			//������
			int age = raf.readInt();
			System.out.println(username+","+password+","+nickname+","+age);
		}
		
		raf.close();
	}
}











