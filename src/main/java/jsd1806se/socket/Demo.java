package socket;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] allOut = {2,5,6,8,7,9,4,1,3};
		System.out.println(Arrays.toString(allOut));
		int pw = 4;
		//��4��������ɾ��
		
		for(int i=0;i<allOut.length;i++){
			if(allOut[i]==pw){
				//�����һ��Ԫ�����õ���λ��
				allOut[i] = allOut[allOut.length-1];
				allOut = Arrays.copyOf(allOut, allOut.length-1);
				break;
			}
		}
		
		
		System.out.println(Arrays.toString(allOut));
	}
}




