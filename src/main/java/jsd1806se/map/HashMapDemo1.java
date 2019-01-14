package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map �ӿ�
 * Map ���ұ�
 * Map�ṹ��������һ���������еı�����г�Ϊkey������
 * ��Ϊvalue��Map������key-value�Ե���ʽ����һ�����ݡ�
 * ���һ�ȡ��Ϣ�Ǹ���key���Ҷ�Ӧ��value��
 * 
 * ����ʵ����:HashMap��ɢ�б�ʹ��ɢ���㷨ʵ�ֵ�Map��
 *           �����ѯ�ٶ��������ݽṹ��
 * 
 * 
 * @author adminitartor
 *
 */
public class HashMapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map 
			= new HashMap<String,Integer>();
		/*
		 * V put(K k,V v)
		 * ��ǰMap�д��ָ����key-value�ԡ�
		 * Map��һ��Ҫ��key�������ظ����Ƿ��ظ�Ҳ��
		 * ����key����equals�ȽϵĽ����
		 * �����Map�����е�key����key-value�������滻
		 * value��������ô����ֵΪ���滻��value������
		 * ��null��
		 */
		map.put("����", 98);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("����", 95);
		map.put("��ѧ", 98);		
		System.out.println(map);
		/*
		 * ���value�ǰ�װ�࣬��ôע�⣬����put��������
		 * ֵʱҪʹ�ð�װ����գ��мǲ�Ҫֱ���û�������
		 * ��Ϊ������������Զ�����Ĳ��������put����
		 * ����ֵΪnull����ô�ͻ��׳���ָ���쳣�ˡ�
		 */
		Integer old = map.put("��ѧ", 55);	
		System.out.println(map);
		System.out.println("old:"+old);
		
		/*
		 * ��ȡԪ�ظ���(һ���ֵ����һ��Ԫ��)
		 */
		int size = map.size();
		System.out.println("size:"+size);
		
		
		/*
		 * V get(Object k)
		 * ���ݸ�����key��ȡ��Ӧ��value
		 * ��������key��Map�в����ڣ��򷵻�ֵΪnull��
		 */
		Integer value = map.get("����");
		System.out.println("value:"+value);
		
		value = map.get("����");
		System.out.println("value:"+value);
		
		
		/*
		 * V remove(K k)
		 * ���ݸ�����keyɾ����Ӧ����һ���ֵ�ԣ�����ֵ
		 * Ϊ��key����Ӧ��value
		 */
		old = map.remove("����");
		System.out.println(map);
		System.out.println("old:"+old);
	}
}










