package newcode_jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ��������
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ�
 * �������鳤�ȵ�һ�룬������2����������������0��
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
