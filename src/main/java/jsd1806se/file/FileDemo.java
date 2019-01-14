package file;

import java.io.File;

/**
 * java.io.File
 * File��ʾһ������·�����򵥵����Ϊ���Է����ļ�ϵͳ��
 * ��һ���ļ���Ŀ¼��
 * ʹ��File���ǿ���:
 * 1:�������ʾ���ļ���Ŀ¼��������Ϣ(���֣���С��
 *   �޸�ʱ���)
 * 2:���Բ����ļ���Ŀ¼(������ɾ��)
 * 3:���Է���һ��Ŀ¼�е���������
 * 
 * ���ǲ��ܷ���һ���ļ�������
 * 
 * @author adminitartor
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * ������ĿĿ¼�µ�test.txt�ļ�
		 * ��ʹ��·��ʱ��ͨ�����Ƕ�ʹ�����·������Ϊ
		 * ����·����ָ��̫��ȷ�����µ������ǲ��ɱ䶯��
		 * ��ô�ڿ�ƽ̨ʱ����ֺܶ����⡣
		 * ���Ŀ¼�Ƚ�������Ҫ�����Ե�·�������
		 * ����Ե�·��Ҫ���ڳ�������л�����������������
		 * ���ڶ�����eclipse�����г�����ԣ���ô���ʾ��
		 * "��ǰĿ¼"���ǵ�ǰ�������ڵ���ĿĿ¼��
		 * 
		 */
		File file = new File("./test.txt");
		
		String name = file.getName();
		System.out.println(name);
		
		long length = file.length();
		System.out.println(length+"�ֽ�");
		
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		System.out.println("�ɶ���"+cr);
		System.out.println("��д��"+cw);
		
		boolean ih = file.isHidden();
		System.out.println("�Ƿ�����:"+ih);
		
		String path = file.getAbsolutePath();
		System.out.println(path);
	}
}




















