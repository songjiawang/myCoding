package newcode_ChengXuYuanMIanShiJInDian;
/**
 * ¶þ²æÊ÷Æ½ºâ¼ì²é
 * @author purple
 *
 */
public class Demo18 {
	public boolean isBalance(TreeNode root) {
        // write code here
		int ldp,rdp;
		if(root==null)return true;
		else{
			ldp = treeDeep(root.left);
			rdp = treeDeep(root.right);
		}
		if(Math.abs(ldp-rdp)<=1){
			return isBalance(root.left)&&isBalance(root.right);
		}else{
			return false;
		}
    }
	public int treeDeep(TreeNode root){
		int ldp,rdp;
		if(root==null)return 0;
		else{
			ldp = treeDeep(root.left);
			rdp = treeDeep(root.right);
			return ldp>rdp?ldp+1:rdp+1;
		}
	}
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}