package file;

import java.io.File;
import java.io.FileFilter;

/**
 * File�ṩ��һ�����ص�listFiles���������Դ���һ���ļ�
 * ��������Ȼ��ֻ����Ŀ¼�����������Ҫ�������ء�
 * @author adminitartor
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ĿĿ¼��������������"."��ͷ������
		 */
		File dir = new File(".");
//		FileFilter filter = new MyFilter();
		/*
		 * ʹ�������ڲ�����ʽ�����ļ�������
		 * ��������Ϊ:ֻ��ȡ�ļ���
		 */
		FileFilter filter = new FileFilter(){
			public boolean accept(File file) {
				return file.isFile();
			}
			
		};
		
		File[] subs = dir.listFiles(filter);
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}

//class MyFilter implements FileFilter{
//	public boolean accept(File file) {
//		String name = file.getName();
//		System.out.println("���ڹ���:"+name);
//		return name.startsWith(".");
//	}
//	
//}








