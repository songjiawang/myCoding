package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
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
