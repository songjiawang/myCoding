package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author purple
 *
 */
public class Demo26 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList <Integer>list = new ArrayList<Integer>();
        LinkedList<TreeNode> l = new LinkedList<TreeNode>();
        if(root==null)return list;
        l.add(root);
        while(!l.isEmpty()){
        	TreeNode tmp = l.peek();
        	list.add(tmp.val);
        	if(tmp.left!=null)l.add(tmp.left);
        	if(tmp.right!=null)l.add(tmp.right);
        	l.removeFirst();
        	
        }
        
        return list;
    
	
	}
}
