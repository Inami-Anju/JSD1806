package file;

import java.io.File;

/**
 * 1:���дһ�δ��룬���1+2+3+4+....100������������
 *   ����δ����в��ó���for,while�ؼ��֡�
 *   
 * 2:����ˮ��1��Ǯ1ƿ��ˮ��2����ƿ���Ի�һƿ��ˮ��3��ƿ
 *   �ǿ��Ի�һƿ��ˮ���ʣ�20��Ǯ���Ժȶ���ƿ��ˮ?   
 *   
 * 
 * 
 * 
 * 
 * ��ɷ�����ɾ��������File��ʾ���ļ���Ŀ¼
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		File file = new File("a");
		delete(file);
	}
	/**
	 * �ݹ����
	 * ��ν�ݹ����������ڵ�ǰ�����ڲ��ٴε��õ�ǰ����
	 * �������Ϊ�ݹ���á�
	 * �ݹ�Ҳ�����ظ�ִ��ĳ��������������for��while��ͬ
	 * ���ǿ��Խ�����������ͷ������
	 * �ݹ����ܲ����������Դ��������Ծ�������ʹ�á�
	 * �ݹ����һ������һ����֧�б����Ƶģ��������ڲ�һ��
	 * �ٴε��ø÷�������ô��һ����ѭ����
	 * 
	 * 
	 * @param file
	 */
	public static void delete(File file){
		/*
		 * �����жϵ�ǰFile��ʾ���Ƿ��ļ�����Ŀ¼
		 */
		if(file.isDirectory()){
			//����ո�Ŀ¼
			//1��ȡ��Ŀ¼����������
			File[] subs = file.listFiles();
			//2�������飬��ÿ������ɾ��
			for(int i=0;i<subs.length;i++){
				File sub = subs[i];
				delete(sub); 
			}
		}
		file.delete();
		
	}
}






