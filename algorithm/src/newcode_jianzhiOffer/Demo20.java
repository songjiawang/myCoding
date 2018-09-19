package newcode_jianzhiOffer;

import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
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
