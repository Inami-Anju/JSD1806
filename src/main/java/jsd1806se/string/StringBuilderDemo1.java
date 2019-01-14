package string;
/**
 * �ַ�������ƹ�ע�����ַ��������ã������޸��ַ������ԣ�
 * Ч������Դ���Ķ��Ƚϴ�Ϊ���ַ������ʺ�Ƶ�����޸ġ�
 * �Դˣ�java�ṩ��һ��ר�������޸��ַ������ݵ���:
 * StringBuilder�����ڲ�ά��һ���ɱ��char���飬�����޸�
 * ���ǽ�����һ��StringBuilder��������ɣ����ᷴ������
 * �¶��󡣲����仹�ṩ�˱����޸��ַ������ݵ���ط�����
 * �����Ĳ�����:����ɾ���ģ��塣
 * @author adminitartor
 *
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		//Ĭ�ϴ����ڲ���ʾ���ַ���
//		StringBuilder builder = new StringBuilder();
		
		String string = "Ŭ��ѧϰjava";
		StringBuffer builder = new StringBuffer(string);
		
		/*
		 * append():��ǰ�ַ���ĩβ׷�Ӹ�������
		 */
		builder.append(",Ϊ���Ҹ��ù���!");
		
		//��ȡbuilder�ڲ��޸ĺõ��ַ���
		string = builder.toString();
		System.out.println(string);
		
		
		/*
		 * replace():����ǰ�ַ���ָ����Χ�ڵ������滻
		 * Ϊ�����ַ���(�޸Ĳ�������)
		 */
		//Ŭ��ѧϰjava,Ϊ���Ҹ��ù���!
		//Ŭ��ѧϰjava,����Ϊ�˸ı�����!
		builder.replace(9, 16, "����Ϊ�˸ı�����");
		System.out.println(builder.toString());
		
		/*
		 * delete():ɾ����ǰ�ַ�����������
		 */
		//Ŭ��ѧϰjava,����Ϊ�˸ı�����!
		//,����Ϊ�˸ı�����!
		builder.delete(0, 8);
		System.out.println(builder.toString());
		
		
		/*
		 * insert():��ָ�����ݲ��뵽ָ��λ��
		 */
		//,����Ϊ�˸ı�����!
		//����,����Ϊ�˸ı�����!
		builder.insert(0, "����");
		System.out.println(builder.toString());
	}
}








