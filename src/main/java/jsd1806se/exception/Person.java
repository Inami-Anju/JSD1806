package exception;

import java.awt.event.MouseWheelEvent;

/**
 * ʹ�õ�ǰ������쳣���׳�
 * @author adminitartor
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * ��һ������ʹ��throws����һ���쳣���׳�ʱ����ô
	 * �������ڵ��ø÷���ʱ�ͱ��봦������쳣
	 */
	public void setAge(int age)throws IllegalAgeException {
		if(age<0||age>100){
			/*
			 * һ����������ʹ��throw�׳�ʲô�쳣����Ҫ
			 * �ڷ�����ʹ��throws�������쳣���׳���ֻ��
			 * RuntimeException�������������������쳣
			 * ���Ǳ���ģ�������벻ͨ��
			 */
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	}
	
	
}









