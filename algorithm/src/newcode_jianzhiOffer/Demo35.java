package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * @author purple
 *
 */
public class Demo35 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {      
        ArrayList<Integer> resList = new ArrayList();
        if(k<=0 || input.length==0 || k>input.length)return resList;
        //*************************ð������*********************
        for (int i = 0; i <input.length-1; i++) {
			for (int j = input.length-1; j >i ; j--) {
				if(input[j]<input[j-1]){
					int tmp  = input[j];
					input[j]=input[j-1];
					input[j-1]=tmp;
				}
			}
		}
        
        //*************************end************************
        
        for (int i = 0; i < k; i++) {
			resList.add(input[i]);
		}
        return resList;
        
        
    }
}
