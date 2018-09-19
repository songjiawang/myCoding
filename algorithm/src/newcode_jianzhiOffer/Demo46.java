package newcode_jianzhiOffer;
/**
 * ����һ�ö��������жϸö������Ƿ���ƽ���������
 * @author purple
 *
 */
public class Demo46 {
	public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)return true;
		if(Math.abs(TreeDepth(root.left)-TreeDepth(root.right))>1)return false;
        else return (true && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right));
    }
	public int TreeDepth(TreeNode root){
		if(root==null)return 0;		
		int leftDepth = TreeDepth(root.left);
		int rightDepth = TreeDepth(root.right);
		return (leftDepth>rightDepth?leftDepth:rightDepth)+1;
	}
}
