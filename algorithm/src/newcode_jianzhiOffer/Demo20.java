package newcode_jianzhiOffer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * @author purple
 *
 */
public class Demo20 {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
	      if(pushA.length==0)return true;
	      int start=0;
	      int end = pushA.length;
	      Stack<Integer> s = new Stack<Integer>();
	      int i=0,j=0;
	      while(i<=pushA.length && j<popA.length){
	    	  if(!s.empty() && s.peek()==popA[j]){
	    		  s.pop();
	    		  if(j==popA.length-1)return true;
	    		  j++;
	    	  }else{	
	    		  if(i<pushA.length){
	    		  s.push(pushA[i]);	 
	    		   i++;}   		  
	    		  else return false;
	    	  }
	    	  
	      }
	      
		return false;
    }
	public static void main(String[] args) {
		Demo20 d = new Demo20();
		int []a={1,2,3,4,5};
		int []b={4,5,3,2,1};
		System.out.println(d.IsPopOrder(a, b));
	}
}
