package file;

import java.io.File;

/**
 * ����һ��Ŀ¼�е���������
 * @author adminitartor
 *
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼�е���������
		 */
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * �жϵ�ǰFile��ʾ���Ƿ�Ϊһ���ļ�
		 * 
		 * boolean Directory()
		 * �жϵ�ǰFile��ʾ���Ƿ�Ϊһ��Ŀ¼
		 */
		if(dir.isDirectory()) {
			//��ȡ��������
			File[] subs = dir.listFiles();
			for(int i=0;i<subs.length;i++){
				File sub = subs[i];
				System.out.println(sub.getName());
			}
		}
		
		
	}
}











