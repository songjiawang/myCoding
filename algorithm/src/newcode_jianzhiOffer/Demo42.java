package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * ������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
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
