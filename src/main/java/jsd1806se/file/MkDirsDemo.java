package file;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * @author adminitartor
 *
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´���Ŀ¼:a/b/c/d/e/f
		 * 
		 * mkdir�ڴ���Ŀ¼ʱҪ�������ڵĸ�Ŀ¼�������
		 * ���򴴽����ɹ�����mkdirs��Ὣ���в����ڵĸ�
		 * Ŀ¼�Զ�����������
		 */
		File dir = new File("a/b/c/d/e/f");
		if(!dir.exists()){
			dir.mkdirs();
			System.out.println("�������!");
		}else{
			System.out.println("Ŀ¼�Ѵ���!");
		}
		
		
	}
}







