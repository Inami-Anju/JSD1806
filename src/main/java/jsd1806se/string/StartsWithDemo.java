package string;
/**
 * String startsWith(String str)
 * �жϵ�ǰ�ַ����Ƿ����Ը������ַ�����ʼ��
 * 
 * String endsWith(String str)
 * �жϵ�ǰ�ַ����Ƿ����Ը������ַ�����β��
 * 
 * @author adminitartor
 *
 */
public class StartsWithDemo {
	public static void main(String[] args) {
		String line = "thinking in java";
		
		boolean starts = line.startsWith("think");
		System.out.println("starts:"+starts);
		
		boolean ends = line.endsWith("ava");
		System.out.println("ends:"+ends);
	}
}










