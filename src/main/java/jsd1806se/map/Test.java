package map;

import java.util.HashMap;
import java.util.Map;

/**
 * ͳ���ַ����и��ַ����ֵĸ���,��������
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		String str = "helloworld,thinking in java!";
		/*
		 * ˼·:
		 * ��Map����ͳ�ƽ��
		 * key:���ֵ��ַ�
		 * value:��Ӧ�ַ����ֵĴ���
		 * 
		 * �����ַ�����ÿ���ַ��������ַ���Map�в�����ʱ
		 * ˵�����ַ��ǵ�һ�γ��֣����ַ���Ϊkey��valueΪ
		 * 1����Map�С�
		 * �����ڣ�˵�����ַ�ͳ�ƹ���ֻ��Ҫ����Ӧ��value
		 * ȡ������+1�ٴ��롣
		 */
		Map<Character, Integer> map 
			= new HashMap<Character,Integer>();	
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}		
		System.out.println(map);
	}
}






