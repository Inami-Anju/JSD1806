package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * 
 * ��������һ�Ը߼�����ʹ�����ǿ��Ժܷ���Ľ���java����
 * �ζ���Ķ�д����
 * @author adminitartor
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException {
		String name = "����ʦ";
		int age = 18;
		String gender = "Ů";
		String[] otherInfo = {"��һ����Ա","������д����","������С","�ٽ������Ļ�����","�������ͬ����������ʦ"};		
		Person person = new Person(name, age, gender, otherInfo);
		System.out.println(person);		
		/*
		 * ��person����д���ļ�"person.obj"
		 */
		FileOutputStream fos	
			= new FileOutputStream("person.obj");
		/*
		 * Ϊ�˷���д���������Ӷ��������
		 */
		ObjectOutputStream oos	
			= new ObjectOutputStream(fos);
		/*
		 * ����������ṩ�ķ���:
		 * void writeObject(Object obj)
		 * �÷������ڽ���������ת��Ϊһ���ֽں�д����
		 * ��Ҫע�⣬д���Ķ������ʵ�ֽӿ�:Serializable
		 * ������׳��쳣��
		 *
		 * 
		 * ����Ĳ�����������������
		 * 1:����������������սṹת��Ϊ��һ���ֽ�
		 *   ������̳�Ϊ:�������л�
		 * 
		 * 2:�ļ�������������ֽ�д�뵽�ļ���(Ӳ����)
		 *   �����ñ���Ĺ��̳�Ϊ:���ݳ־û�
		 */
		oos.writeObject(person);
		System.out.println("д�����!");
		
		oos.close();
		
	}
}








