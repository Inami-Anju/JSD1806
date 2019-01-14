package map;
/**
 * HashMap�ǵ����ѯ�ٶ��������ݽṹ���ڲ�ʹ������ʵ
 * �֣���HashMap���Ը���key��hashcodeֵ�������������
 * ��Ӧ���±꣬��ʡȥ�˱��������ѯ�Ĺ������Ӷ���ѯ����
 * ������������Ӱ�졣
 * ���ǻ�Ӱ��HashMap��ѯ���ܵ��������HashMap�в�������
 * �����������һ����Ҫ���Ϊ��
 * ������Key��hashcodeֵ��ͬ������equals�Ƚϲ�һ��ʱ��
 * ��HashMap�оͻ��������
 * ע:hashcode����Ԫ���������е�λ�ã�equals����key�Ƿ�
 *    �ظ�.
 * Ϊ�ˣ�API�ֲ������������������д����ȷ˵��:
 * 1:�ɶ���д
 *   ����Ҫ��дһ�����equals����ʱ��Ҫ��ͬ��дhashCode
 *   ������
 * 2:һ����
 *   ����������equals�Ƚ�Ϊtrueʱ��hashCode�������ص���
 *   �ֱ�����ȡ���֮��Ȼ(���Ǳ���)��hashCode���ʱ��
 *   equals�ȽϾ�����֤Ϊtrue����Ϊ��ʹ��������ʵ����Ϊ
 *   key��HashMap��ʹ��ʱ������������hashCodeֵ��ȣ���
 *   equals�Ƚϲ�Ϊtrueʱ���������
 * 3:�ȶ���
 *   ������equals�Ƚϵ�����ֵû�з����ı��ǰ���£����
 *   ����hashCode�������ص�����Ӧ�����ֲ��䡣       
 * @author adminitartor
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}











