package map;

import java.util.HashMap;
import java.util.Map;

/**
 * MapҲ�ṩ�˶�Ӧ��contains���������ҿ��Էֱ��жϰ���
 * key��value
 * boolean containsKey(K k)
 * boolean containsValue(V v)
 * 
 * @author adminitartor
 *
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map 
			= new HashMap<String,Integer>();
		map.put("����", 98);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("����", 95);
		map.put("��ѧ", 98);		
		System.out.println(map);
		/*
		 * key��value�İ�����ϵҲ������Ԫ������equals
		 * �����ȽϵĽ��������
		 */
		boolean ck = map.containsKey("����");
		System.out.println("����key:"+ck);
		
		boolean cv = map.containsValue(95);
		System.out.println("����value:"+cv);
	}
}












