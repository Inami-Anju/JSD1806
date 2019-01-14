package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.RandomAccess;
import java.util.Scanner;

/**
 * �޸��ǳ�
 * ����Ҫ�޸��ǳƵ��û����û�����Ȼ�󽫸��û����ǳ��޸�
 * ��������û�����Ч����������ʾ��
 * @author adminitartor
 *
 */
public class UpdateUserDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = scanner.nextLine();
		System.out.println("�������µ��ǳ�:");
		String nickname = scanner.nextLine();
		
		RandomAccessFile raf 
			= new RandomAccessFile("user.dat", "rw");
		
		boolean have = false;//Ĭ���޴���
		for(int i=0;i<raf.length()/100;i++){
			//�ƶ�ָ�뵽�ü�¼�û�����λ��
			raf.seek(i*100);	
			//�ȶ�ȡ�û���
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data,"UTF-8").trim();
			//�ж��Ƿ���Ҫ�޸ĵ��û�
			if(name.equals(username)){
				//�޸��ǳ�
				//1���ƶ�ָ�뵽������¼�ǳƵ�λ��
				raf.seek(i*100+64);
				//2���µ��ǳ���32�ֽ���ʽд���λ��
				byte[] nickArr = nickname.getBytes("UTF-8");
				nickArr = Arrays.copyOf(nickArr, 32);
				raf.write(nickArr);
				System.out.println("�޸����!");
				have = true;
				break;
			}
		}
		if(!have){
			System.out.println("�޴��û�!");
		}
		raf.close();
		
	}
}












