package newcode_jianzhiOffer;
/**
 * ���������Ķ�����������任ΪԴ�������ľ���
 * @author purple
 *
 */
public class Demo25 {
	 public void Mirror(TreeNode root) {
		 if(root!=null &&( root.left!=null || root.right!=null) ){
			 TreeNode tmp = root.left;
			 root.left=root.right;
			 root.right=tmp;
			 Mirror(root.left);
			 Mirror(root.right);
		 }else{
			 return;
		 }
		 
	 }
	 
}
