package file;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * @author adminitartor
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		/*
		 * ɾ����ĿĿ¼�µ�demoĿ¼
		 * delete������ɾ��Ŀ¼ʱ��һ��ǰ������������
		 * Ŀ¼������һ����Ŀ¼�ſ���ɾ��
		 */
		File dir = new File("demo");
		if(dir.exists()){
			dir.delete();
			System.out.println("Ŀ¼��ɾ��");
		}else{
			System.out.println("Ŀ¼������!");
		}
		
	}
}







