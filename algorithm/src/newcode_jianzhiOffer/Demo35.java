package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author purple
 *
 */
public class Demo35 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {      
        ArrayList<Integer> resList = new ArrayList();
        if(k<=0 || input.length==0 || k>input.length)return resList;
        //*************************冒泡排序*********************
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
