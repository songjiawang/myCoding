package newcode_jianzhiOffer;
/**
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
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
