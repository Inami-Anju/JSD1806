package exception;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ������д���ຬ��throws�����쳣�׳��ķ���ʱ��throws
 * ����д����
 * @author adminitartor
 *
 */
public class ThrowsDemo {
	public void dosome()
			throws IOException,AWTException{
		
	}
}

class Son extends ThrowsDemo{
//	public void dosome()
//			throws IOException,AWTException{
//		
//	}
	
	//��дʱ���Բ����׳��κ��쳣
//	public void dosome(){
//		
//	}
	
	//���Խ��׳������쳣
//	public void dosome()throws IOException{
//		
//	}
	
	//�����׳����෽���׳��쳣���������쳣
//	public void dosome()throws FileNotFoundException{
//		
//	}
	
	//�������׳������쳣
//	public void dosome()throws SQLException{
//		
//	}
	
	//�������׳����෽���׳����쳣�ĸ������쳣
//	public void dosome()throws Exception{
//		
//	}
}






