package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
 * ���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� �������{2,3,4,2,6,2,5,1}�Ļ�������������6����
 *  {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}��
 *   {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
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
