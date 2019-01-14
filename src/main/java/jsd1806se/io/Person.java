package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * ʹ�ø�����Զ������Ķ�д����
 * 
 * ��һ����ϣ�������������ж�д����ô�������ʵ�ֽӿ�:
 * java.io.Serializable
 * �ýӿ�û���κγ��󷽷������ֽӿڳ�Ϊ:ǩ���ӿڡ�
 * ��Ȼ��Դ���в���Ҫ��д��������ʵ���ϱ������ڱ������
 * Ϊclass�ļ�ʱ����ݵ�ǰ��ṹ���һ�����������ڽ���ǰ
 * ��ʵ��ת��Ϊһ���ֽڡ�
 * 
 * 
 * @author adminitartor
 *
 */
public class Person implements Serializable{
	/**
	 * ��һ����ʵ����Serializable�ӿں󣬱���������ʾ
	 * ����Ӧ�����һ������:serialVersionUID
	 * ���л��汾��Ӱ���ŷ����л��Ľ������������������
	 * �����л�һ��ʵ��ʱ�����ʵ��������������İ汾
	 * ���Ƿ�һ�£���һ�������л����׳��汾�Ų�һ�µ�
	 * �쳣����һ����ɹ����з����л���
	 * ����ά���汾�ſ�������ȷ�������л��������������
	 * ָ�����л��汾�ţ��������ڱ��뵱ǰ��ʱ����ݵ�ǰ
	 * ��Ľṹ����һ���汾�ţ�����ֻҪ��ǰ�෢���ı䣬
	 * ��汾��һ����ı䡣
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * transient�ؼ���
	 * ��һ�����Ա��ùؼ������κ���ô�������ĳ��ʵ��
	 * �����л�ʱ�����ֵ�ᱻ���ԡ���ô�ڶ������л�ʱ
	 * Ҳ����õ���ֵ��
	 * ����ĳЩ����Ҫ�����Կ��Դﵽ����"����"�Ĳ���������
	 * ��Դ���ġ�
	 */
	private transient String[] otherInfo;
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString() {
		return name+","+age+","+gender+","+
	           Arrays.toString(otherInfo);
	}
	
	
	
}









