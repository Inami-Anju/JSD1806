package string;
/**
 * ��г����
 * @author adminitartor
 *
 */
public class ReplaceAllDemo2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgdsb|mmp|sb|nc|tmd|mdzz|cnm|djb)";
		
		String message = "wqnmlgdsb!�����sb!����ô��ô��nc!mdzz!�����djb!";
		
		message = message.replaceAll(regex, "***");
		
		System.out.println(message);
		
		
		
	}
}





