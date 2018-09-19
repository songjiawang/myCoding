package newcode_ChengXuYuanMIanShiJInDian;

import java.util.LinkedList;

/**
 * 输出二叉树的单层节点
 * @author purple
 *
 */
public class Demo21 {
	public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
		LinkedList<TreeNode> list = new LinkedList();
		if(root==null)return null;
		int index = 0;
		ListNode head = new ListNode(0);
		ListNode headTmp = head;
		list.add(root);
		list.add(null);
		
		while(!list.isEmpty()){
			if(list.peek()!=null){
				TreeNode node = list.pop();
				if(node.left!=null)list.add(node.left);
				if(node.right!=null)list.add(node.right);
				
				if(index == dep-1){
					ListNode tmp = new ListNode(node.val);
					headTmp.next = tmp;
					headTmp = headTmp.next;
				}
				
			}else{
				list.pop();
				list.add(null);
				index++;
				if(index>=dep){
					return head.next;
				}
			}
		}
		return head.next;
    }
}




