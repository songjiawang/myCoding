package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 * @author purple
 *
 */
public class Demo49 {
	public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		LinkedList<TreeNode> list = new LinkedList<>();
		ArrayList<ArrayList<Integer>> resList = new ArrayList<>();
		if(pRoot==null)return resList;
		list.add(null);
		list.add(pRoot);
		list.add(null);
		boolean leftToRight = true;
		while(!list.isEmpty()){
			TreeNode node = list.peek();
			if(node==null && leftToRight){
				list.pop();
				ArrayList<Integer> oneList= new ArrayList();
				while(list.peek()!=null){
					TreeNode tnode = list.pop();
					oneList.add(tnode.val);
					if(tnode.left!=null)list.add(tnode.left);
					if(tnode.right!=null) list.add(tnode.right);
				}
				list.add(null);
				resList.add(oneList);
				leftToRight = false;
			}else if(node==null && !leftToRight){
				list.pop();
				ArrayList<Integer> oneList= new ArrayList();
				LinkedList<Integer> tmp  = new LinkedList<>();
				while(list.peek()!=null){
					TreeNode tnode = list.pop();
					tmp.addFirst(tnode.val);
					if(tnode.left!=null)list.add(tnode.left);
					if(tnode.right!=null) list.add(tnode.right);
				}
				oneList.addAll(tmp);
				list.add(null);
				resList.add(oneList);
				leftToRight = true;
			}
			
		}
		
		return resList;
    }
}
