package object;
/**
 * ����Point��дObject����ط���
 * @author adminitartor
 *
 */
public class TestPoin {
	public static void main(String[] args) {
		Point point = new Point(1, 2);
		/*
		 * Object�����toString��������ͼ�ǽ��ö�����
		 * һ���ַ�����ʽ���ء����Ǳ���Object�ṩ�����
		 * �������ص��ַ���Ϊ��������"���"����:����
		 * �ĵ�ַ��Ϣ��ʵ�ʿ������岻��Ϊ�ˣ���������Ҫ
		 * �õ�һ�������toString����ʱ����Ӧ����д���
		 * ������ע�⣬java�ṩ�����������д��toString
		 * ֻ�������Լ�����������Ҫ������д��
		 * 
		 */
		String string = point.toString();
		System.out.println(string);
		/*
		 * System.out.println(Object obj)
		 * �÷������Խ����������toString�������ص�
		 * �ַ������������̨��
		 */
		System.out.println(point);
		
		
		Point point2 = new Point(1, 2);
		System.out.println(point==point2);//false
		System.out.println(point.equals(point));
	}
}









