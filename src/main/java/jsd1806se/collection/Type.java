package collection;
/**
 * ����
 * ���Ϳ��������������ʹ��ʱ����һ���������ԣ�����������
 * ֵ�ȵ����ͣ��Ӷ���ߴ���������
 * @author adminitartor
 *
 */
public class Type<T> {
	private T x;
	private T y;
	
	public Type(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}







