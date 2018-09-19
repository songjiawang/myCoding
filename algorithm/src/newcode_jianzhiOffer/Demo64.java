package newcode_jianzhiOffer;
/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author purple
 *
 */
public class Demo64 {
	public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)return null;
        TreeNode res = pRootOfTree;
       // while(res.left!=null) res =res.left;
        
        trian_shift(pRootOfTree,null);
       i while(res.left!=null)res =res.left;
        return res;
    }
	public void trian_shift(TreeNode head,TreeNode preNode){
		if(head!=null){
			trian_shift(head.left,preNode);
			head.left=preNode;
			if(preNode!=null)preNode.right = head;
			preNode = head;
			trian_shift(head.right,preNode);
			
			
		}
	}
}
