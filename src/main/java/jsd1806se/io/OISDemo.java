package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ���������������ڽ��ж������л�
 * @author adminitartor
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis
			= new FileInputStream("person.obj");
		ObjectInputStream ois
			= new ObjectInputStream(fis);
		/*
		 * ��������ȡ���ֽڱ����Ƕ����������һ������
		 * ת����һ���ֽڣ������ȡ���̻��׳���û���ҵ�
		 * ���쳣:ClassNotFoundException
		 * 
		 * ��һ���ֽڻ�ԭΪ����Ĺ��̳�Ϊ:�������л�
		 */
		Person person = (Person)ois.readObject();
		System.out.println(person);
		
		ois.close();
	}
}










