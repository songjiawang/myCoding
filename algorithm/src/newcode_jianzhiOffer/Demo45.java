package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * @author purple
 *
 */
public class Demo45 {
	public int TreeDepth(TreeNode root) {
       ArrayList<Integer> list = new ArrayList<>();
       int max = -1;
       count(root,0,list);
       for(int i:list){
    	   max=i>max?i:max;
       }
		return max;
    }
	public void count(TreeNode root , int sum, ArrayList<Integer> list ){
		if(root==null){
			list.add(sum);
			return;
		}else{
			sum =sum+1;
			count(root.left,sum,list);
			count(root.right,sum,list);
			
		}
		
		
		
	}
	
}
