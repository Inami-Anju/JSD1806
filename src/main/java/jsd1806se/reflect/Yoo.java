package reflect;

public class Yoo {
	
	@Test //��ע�Զ���ע��
	public void test(){
		System.out.println("test()");  
	}
	
	@Override
	@Test
	public String toString() {
		return super.toString();
	}
}
