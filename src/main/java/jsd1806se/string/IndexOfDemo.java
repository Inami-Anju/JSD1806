package string;
/**
 * int indexOf(String str)
 * ���Ҹ����ַ����ڵ�ǰ�ַ����е�λ�á�����ǰ�ַ���������
 * �������ݣ��򷵻�ֵΪ-1.
 * @author adminitartor
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		int index = str.indexOf("in");
		System.out.println("index:"+index);
		/*
		 * ���ط��������ָ��λ�ÿ�ʼ���ҵ�һ�γ��ֵ�λ��
		 */
		index = str.indexOf("in", 3);
		System.out.println("index:"+index);
		/*
		 * ���Ҹ����ַ����ڵ�ǰ�ַ��������һ�γ��ֵ�λ��
		 */
		index = str.lastIndexOf("in");
		System.out.println("index:"+index);
		
	
	}
}











