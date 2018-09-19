package newcode_jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author purple
 *
 */
public class Demo34 {
	public int MoreThanHalfNum_Solution(int [] array) {
	    if(array.length==0)return 0; 
		Map<Integer,Integer> map = new HashMap();
		int max = 1;
		int maxIndex =0; 
	     for(int i=0;i<array.length;i++){	    	 
	    	 if(map.containsKey(array[i])){
	    		 int n = map.get(array[i])+1;
	    		 maxIndex = n>max?i:maxIndex;
	    		 max = n>max?n:max;
	    		 map.put(array[i],n);
	    	 }else{
	    		 map.put(array[i], 1);
	    	 }
	     }
	     
	     return max>(array.length/2)?array[maxIndex]:0;
	}
}
