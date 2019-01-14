package list;
/**
 * ��Ϊ����Ԫ�ز��Լ�����ز���
 * 
 * @author adminitartor
 *
 */
public class Point implements Comparable<Point>{
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
	
	public String toString(){
		// (1,2)
		return "("+x+","+y+")";
	}
	
	
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

	/**
	 * ��һ����ʵ����Comparable�ӿں�Ҫ�����ʵ��
	 * compareTo�������÷����������Ƕ��嵱ǰ����this
	 * ���������o֮��Ĵ�С��ϵ��
	 * 
	 * ����ֵ��һ��intֵ����ֵ�����ľ���ȡֵ��ֻ��ע
	 * ȡֵ��Χ��
	 * ��:
	 * ����ֵ>0ʱ:��ǰ������ڲ�������(this>o)
	 * ����ֵ<0ʱ:��ǰ����С�ڲ�������(this<o)
	 * ����ֵ=0ʱ:�����������
	 */
	public int compareTo(Point o) {
		/*
		 * ������Ƚϴ�С�ķ�ʽ:�㵽ԭ��ľ��볤�Ĵ�
		 */
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}
	
}











