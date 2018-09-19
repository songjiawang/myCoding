package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。用null分割每一行
 * @author purple
 *
 */
public class Demo53 {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer> > resList = new ArrayList<>();
		LinkedList<TreeNode> list = new LinkedList<>();
		if(pRoot==null)return resList;		
		list.add(pRoot);
		list.add(null);
		while(!list.isEmpty()){
			ArrayList<Integer> oneList = new ArrayList<>();
			while(list.peek()!=null){				
				TreeNode node = list.pop();
				oneList.add(node.val);
				if(node.left!=null)list.add(node.left);
				if(node.right!=null)list.add(node.right);
			}
			resList.add(oneList);
			if(list.size()==1)break;
			list.pop();
			list.add(null);
		
		}
		return resList;
    }
}
