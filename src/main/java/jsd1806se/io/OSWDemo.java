package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java���ն�д�����ݵ�λ��������Ϊ������:
 * �ֽ������ַ���
 * �ֽ��������ֽ�Ϊ��λ��д���ݵ��������ڼ�����ײ㶼��
 * 2���ƣ������ֽ������Զ�д�������ݡ�
 * 
 * �ַ��������ַ�Ϊ��λ��д���ݵ�����ʵ�ʵײ㻹�Ƕ�д�ֽ�
 * �����ַ������Զ����ֽ����ַ����ж�Ӧ��ת�����������
 * �ַ������������ַ�������������Դ��ַ���Ҳ�������ڶ�д
 * �ı����ݡ�
 * 
 * java.io.Reader,java.io.Writer�����������ַ�������
 * ���ַ�������ĳ��ࡣ�涨�˶�д�ַ�����ط�����
 * 
 * 
 * ת����
 * java.io.InputStreamReader,java.io.OutputStreamWriter
 * �������ַ������õ�һ��ʵ���࣬ͬʱҲ��һ�Ը߼�����������
 * �����𵽷ǳ���Ҫ��һ�����������£��ν��ֽ����������ַ���
 * ʹ��(��Ϊ�ͼ���ͨ�������ֽ���������д�ַ�ʱ���ǻ�ʹ�ù���
 * ������ַ��߼��������ַ���ͨ��ֻ�����������ַ���)
 * 
 * @author adminitartor
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("����һ��ѧè��~");
		osw.write("һ������������~");
		
		System.out.println("д�����!");
		
		osw.close();
		
	}
}









