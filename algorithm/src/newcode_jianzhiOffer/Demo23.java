package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 *  {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 *   {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * @author purple
 *
 */
public class Demo23 {
	public ArrayList<Integer> maxInWindows(int [] num, int size)
    { ArrayList<Integer> res = new ArrayList<Integer>();
      int start=0;
      int end =size-1;
      int max=0;
      if(end>num.length-1)return res;
      if(size==0)return res;
      while(end<=num.length-1){
    	  max=num[start];
    	  for (int i = start+1; i <= end; i++) {
			if(num[i]>max){
				max=num[i];
			}
		 }
    	  res.add(max);
    	  start++;
    	  end++; 	  
      }
      
    
    return res;	
    
    
        
    }
}
