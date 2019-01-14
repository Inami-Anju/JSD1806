package exception;

import java.io.FileOutputStream;

/**
 * JDK7֮���Ƴ���һ���µ�����:�Զ��ر�
 * java��ʵ����AutoCloseable�ӿڵ��࣬�����Ա���������
 * ���ر� 
 * @author adminitartor
 */
public class AutoCloseable {
	public static void main(String[] args) {	
		try(
			FileOutputStream fos
				= new FileOutputStream("fos.dat");
		){
			fos.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









