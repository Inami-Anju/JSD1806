package collection;
/**
 * JDK1.5֮���Ƴ���һ������:��ǿ��forѭ��
 * Ҳ��Ϊ��ѭ����for each
 * 
 * ��ѭ���������������ϻ�����ʹ�õģ����Թ����ϲ�ȡ��
 * ��ͳforѭ���Ĺ��������Ҹ������Ǳ������Ͽɣ����������
 * �Ͽɡ����������ջὫʹ����ѭ��������Ϊ��ͳ������ʽ��
 * @author adminitartor
 *
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		for(int i=0;i<array.length;i++){
			String str = array[i];
			System.out.println(str);
		}
		/*
		 * ���ձ������Ὣ����ı�Ϊ��ͨforѭ��������ʽ
		 */
		for(String str : array){
			System.out.println(str);		
		}
		
	}
}











