package string;
/**
 * char charAt(int index)
 * ���ص�ǰ�ַ�����ָ��λ�ô���Ӧ���ַ�
 * @author adminitartor
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java"; 
		
		char c = str.charAt(9);
		System.out.println(c);
		
		
		/*
		 * ������
		 * �Ϻ�����ˮ���Ժ���
		 * 
		 * ��������λ���ϵ��ַ��뵹��λ���ϵ��ַ���
		 * һ�������ǻ���
		 */
		String line = "�Ϻ�����ˮ��������";
		for(int i=0;i<line.length()/2;i++){
			char c1 = line.charAt(i);
			char c2 = line.charAt(line.length()-1-i);
			if(c1!=c2){
				System.out.print("��");
				break;
			}
		}
		System.out.println("�ǻ���!");
		
	}
}










