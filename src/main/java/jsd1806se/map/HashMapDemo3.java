package map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı�������
 * ����һ��Map�����ַ�ʽ:
 * �������е�key
 * �������е�key-value��
 * �������е�value(��Բ�����)
 * 
 * @author adminitartor
 *
 */
public class HashMapDemo3 {
	public static void main(String[] args) {
//		Map<String, Integer> map 
//			= new HashMap<String,Integer>();
		/*
		 * LinkedHashMap�������˳����putԪ��ʱ��˳��
		 * һ�¡�
		 */
		Map<String, Integer> map 
			= new LinkedHashMap<String,Integer>();
		map.put("����", 98);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("����", 95);
		map.put("��ѧ", 98);		
		System.out.println(map);
		/*
		 * Set<K> keySet()
		 * �÷����Ὣ��ǰMap�����е�Ԫ����һ��Set����
		 * ��ʽ���أ������ü��Ͼ͵�ͬ���������е�key
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println("key:"+key);
		}
		
		
		/*
		 * ����ÿһ���ֵ��
		 * Set<Entry> entrySet()
		 * �÷����Ὣ��ǰMap��ÿһ���ֵ��(����Entryʵ��)
		 * ��һ��Set������ʽ���ء�
		 * 
		 * java.util.Map.Entry
		 * Entry��Map��һ���ڲ��ӿڣ���ʵ�����ÿһ��ʵ��
		 * ���ڱ�ʾ��ǰMap��һ���ֵ�ԡ��ýӿڹ涨�˻�ȡ
		 * ���ʾ�������ֵ�Ե�key��value�ķ�����
		 * K getKey()
		 * V getValue()
		 * ��ͬ��Map��ʵ����Entry������ʵ����ʵ����ʾ��
		 * ÿһ���ֵ�ԣ�HashMapҲһ����
		 */
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * Collection<V> values()
		 * �������е�value���ص���һ��Collection������
		 * һ��Set���ϣ���ΪMap����Ҫ��value�������ظ���
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value:"+value);
		}
		
	}
	
}












