package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * @author purple
 *
 */
public class Demo42 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       ArrayList<ArrayList<Integer>>resList = new ArrayList<>();
	       int start = 1;
	       int end = 2;
	       int addSum = start+end;
	       while(end<=(sum/2)+1 && start<end ){
	    	   if(addSum>sum){
		    	   addSum = addSum-start;
		    	   start=start+1;	    	   
		       }else if(addSum<sum){
		    	   end = end+1;
		    	   addSum = addSum+end;
		       }else{
		    	   ArrayList<Integer> list = new ArrayList();
		    	   for (int i = start; i <=end; i++) {
		    		   list.add(i);
		    	   }
		    	   resList.add(list);
		    	   end = end+1;
		    	   addSum = addSum+end;
		       }
	       }
	       
  
	return resList;
	
	
	}
}
