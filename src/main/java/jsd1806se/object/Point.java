package object;
/**
 * java�����е��඼�̳���Object����һ����û����ʾ�ļ̳�
 * ĳ����Ĭ�Ͼͼ̳���Object.
 * @author adminitartor
 *
 */
public class Point {
	private int x;
	private int y;	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * �������õ�һ����(�Լ��������)��toString����ʱ
	 * ��Ӧ����д������������ص��ַ���û���ϸ�Ҫ������
	 * �ɸ��ݽ���ʵ�ʿ����������������ԭ���Ϸ��ص��ַ���
	 * ��Ӧ��������ǰ�����������Ϣ��
	 */
	public String toString(){
		// (1,2)
		return "("+x+","+y+")";
	}
	
	/**
	 * Object�����equals��������ͼ�ǱȽ����������
	 * �����Ƿ���ͬ������Object�����ṩ��equals�ڲ�
	 * ������"=="�Ƚϵģ�����ʵ�����壬������ϣ���Ƚ�
	 * ���ݾ�Ӧ����д�÷�����java�ṩ����������Ѿ���д
	 * ���ˡ�ֻ�������Զ��������Ҫ������д��
	 */
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(o == this){
			return true;
		}
		if(o instanceof Point){
			Point point = (Point)o;
			return this.x==point.x&&this.y==point.y;
		}
		
		return false;
	}
	
}











