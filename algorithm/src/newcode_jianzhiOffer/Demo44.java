package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * @author purple
 *
 */
public class Demo44 {
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> resList = new ArrayList<>();
		if(root==null)return resList;
		ArrayList<Integer> list = new ArrayList();
		FindOnePath(root,list,0,target,resList);
		return resList;
    }
	public void FindOnePath(TreeNode root,ArrayList<Integer> list,int sum , int target,ArrayList<ArrayList<Integer>> resList){
		if(sum+root.val==target){
			if(root.left==null && root.right==null){
				list.add(root.val);
				ArrayList<Integer> oneResList = new ArrayList<>();
				for(int n:list){
					oneResList.add(n);
				}
				resList.add(oneResList);	
				list.remove(list.size()-1);
				return ;
			}else{
				list.add(root.val);
				if(root.left!=null)FindOnePath(root.left,list,sum+root.val,target,resList);
				if(root.right!=null)FindOnePath(root.right,list,sum+root.val,target,resList);	
				list.remove(list.size()-1);
				return ;
			}
				
		}
		
		if(sum+root.val<target){
			list.add(root.val);
			if(root.left!=null)FindOnePath(root.left,list,sum+root.val,target,resList);
			if(root.right!=null)FindOnePath(root.right,list,sum+root.val,target,resList);	
			list.remove(list.size()-1);
			return ;
		}
		if(sum+root.val>target){
			return ;
		}
		
	}
	
}
