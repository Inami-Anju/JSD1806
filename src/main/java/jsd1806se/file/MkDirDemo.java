package file;

import java.io.File;

/**
 * ����һ��Ŀ¼
 * @author adminitartor
 *
 */
public class MkDirDemo {
	public static void main(String[] args) {
		/*
		 * ����ĿĿ¼�´���һ����Ϊ:demo��Ŀ¼
		 * 
		 * �����·����"./"���Ժ��Բ�д��Ĭ�Ͼ��Ǵӵ�ǰ
		 * Ŀ¼��ʼ
		 */
//		File dir = new File("./demo");
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("Ŀ¼�Ѵ���!");
		}else{
			System.out.println("Ŀ¼�Ѵ���!");
		}
		
	}
}







