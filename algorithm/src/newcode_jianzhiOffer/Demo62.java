package newcode_jianzhiOffer;

import java.util.LinkedList;

/**
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 * @author purple
 *
 */
public class Demo62 {
	 public static TreeNode  KthNode(TreeNode pRoot, int k) {
	        int[] key = {k};
	        LinkedList<TreeNode> resList = new LinkedList<>(); 
	        if(k==0 || pRoot==null)return resList.peek();
	        System.out.println(111);
	        train(pRoot,resList,key);
	        return resList.peek();
	 }
	 public static void train(TreeNode head,LinkedList<TreeNode> resList,int[] k){
		 if(head!=null){
			 System.out.println(111);
			 train(head.left,resList,k);
			 k[0] = k[0]-1;
			 if(k[0] ==0){
				 resList.add(head);
				 System.out.println(111);
				 return;
			 }				 
			 train(head.right,resList,k);
			 
		 }
	 }
	 public static void main(String[] args) {
		 TreeNode head = new TreeNode(5);
		 TreeNode t = KthNode(head,1);
		 System.out.println(t.val);
	}
}
