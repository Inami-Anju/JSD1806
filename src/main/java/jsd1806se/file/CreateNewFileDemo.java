package file;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ�����ļ�
 * @author adminitartor
 *
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ����ĿĿ¼�´���һ����Ϊ��demo.txt���ļ�
		 * 1:�ȴ���һ��File��ʾ���ļ�
		 * 2:�жϸ��ļ��ǲ����ڵ�
		 * 3:�������ļ�
		 */
		//1
		File file = new File("./demo.txt");
		//2
		if(!file.exists()){
			file.createNewFile();
			System.out.println("�ļ��Ѵ���!");
		}else{
			System.out.println("�ļ��Ѵ���!");
		}
		
		
	}
}






