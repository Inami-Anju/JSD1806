package exception;
/**
 * �����쳣���׳�
 * @author adminitartor
 *
 */
public class ThrowDemo {
	public static void main(String[] args) {
		Person person = new Person();
		/*
		 * ͨ��һ�������׳��쳣���������
		 * 1:�������������������﷨Ҫ�󣬵��ǲ�����ҵ��
		 *   �߼�Ҫ��(����İ��������������)
		 * 2:������ȷʵ�������쳣�����Ǹ��쳣��Ӧ���ɸ�
		 *   ��������ʱ�����׳��������߽��
		 */
		try {
			/*
			 * ������һ������throws�����쳣�׳��ķ���ʱ
			 * ��������ʾ���봦����쳣��������ֶ�����
			 * ��:
			 * 1:ʹ��try-catch���񲢴�����쳣
			 * 2:�����ڵ�ǰ������ʹ��throws�������쳣�׳�
			 */
			person.setAge(1000);
		} catch (IllegalAgeException e) {
			System.out.println("������!");
		}
		System.out.println(person.getAge());
	}
}







