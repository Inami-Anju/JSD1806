package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jdk8֮�󣬼��Ϻ�Map���ṩ��һ����������lambda��ʽ
 * ����Ԫ�أ��������ü��ϻ�Map���̰߳�ȫ�ģ���ô����
 * ������ʽ��Ԫ����ɾҲ�ǲ�����ȫ�ġ�
 * 
 * ����ʹ�õ���������ʱ���ǽ��ܹ����������������ϲ���
 * ����������ɾԪ�ػ��⣬��������Ҫ����ά��ͬ��������
 * �����ֱ�����ʽ������������
 * @author adminitartor
 *
 */
public class LambdaDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");	
		list.forEach((e)->System.out.println(e));
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		
		map.forEach((k,v)->System.out.println(k+":"+v));
	}
}











