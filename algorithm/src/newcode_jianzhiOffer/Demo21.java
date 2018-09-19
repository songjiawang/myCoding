package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @author purple
 *
 */
public class Demo21 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		 ArrayList<Integer> l = new ArrayList<Integer>(); 
		if(array.length<2)return l;
        if(array[0]>=sum)return l;
        int start=0;
        int end=0;
        int resmin=0;
        int resmax=0;
        int pro=10000;
        boolean flag = false;
        for (int i = 1; i < array.length; i++) {
        	if(array[i]<sum){
        		end=i;
        	}else{
        		break;
        	}
		}
        if(end==0)return l;
        
        
       while(start<end ){ 
        if(array[start]+array[end]>sum){
        	end--;
        }else if(array[start]+array[end]<sum){      
        	start++;
        }else{
        	if(array[start]*array[end]<pro){
        	resmin=array[start];
        	resmax=array[end];       	
        	pro=array[start]*array[end];
        	flag=true;
        	}
        	start++;
        	end--;
        }
       }
       System.out.println(resmin+"   "+resmax);
      
       if(flag){        	
        	l.add(resmin);
        	l.add(resmax);
        	
        }
       return l;
		
    }
	public static void main(String[] args) {
		Demo21 d = new Demo21();
		int [] a = {1,2,4,7,11,16};
		d.FindNumbersWithSum(a, 10);
	}
}
