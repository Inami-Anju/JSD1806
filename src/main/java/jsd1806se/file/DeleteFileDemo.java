package file;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author adminitartor
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
		/*
		 * ����ǰĿ¼�е�demo.txt�ļ�ɾ��
		 */
		File file = new File("./demo.txt");
		if(file.exists()){
			file.delete();
			System.out.println("�ļ���ɾ��!");
		}else{
			System.out.println("�ļ�������!");
		}
		
		
	}
}





