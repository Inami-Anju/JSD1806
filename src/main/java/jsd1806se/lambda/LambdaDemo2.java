package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �вη���
 * @author adminitartor
 *
 */
public class LambdaDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����ʦ");
		list.add("С����ʦ");
		list.add("����");	
		//�����ڲ�����ʽʵ�ֱȽ���
//		Comparator<String> com = new Comparator<String>() {
//			public int compare(String o1, String o2) {
//				return o1.length()-o2.length();
//			}
//		};
		//lambda��ʽ
//		Comparator<String> com = (String o1, String o2)->{
//			return o1.length()-o2.length();
//		};
		
		//�����в��������Ϳ��Բ�ָ��
//		Comparator<String> com = (o1,o2)->{
//			return o1.length()-o2.length();
//		};
		
		//����"{}"��ͬʱ����������return,��return�ؼ���ҲҪ����
		Comparator<String> com 
			= (o1,o2)->o1.length()-o2.length();
		
		Collections.sort(list,com);
		System.out.println(list);
		
		
		
		
		
	}
}
