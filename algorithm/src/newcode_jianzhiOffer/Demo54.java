package newcode_jianzhiOffer;
/**
 * ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
 * @author purple
 *
 */
public class Demo54 {
	boolean isSymmetrical(TreeNode pRoot){
        if(pRoot==null)return false;
		TreeNode mirroTree = mirrorTree(pRoot);
        return isMirrorTree(pRoot,mirroTree);
    }
	public TreeNode mirrorTree(TreeNode pRoot){
		TreeNode root = null;
		if(pRoot!=null){
			root = new TreeNode(pRoot.val);
			root.left=mirrorTree(pRoot.right);
			root.right = mirrorTree(pRoot.left);
		}
		return root;
		
	}
	
	public boolean isMirrorTree(TreeNode pRoot1 ,TreeNode pRoot2){
		if(pRoot1!=null && pRoot2!=null){
			if(pRoot1.val==pRoot2.val)return isMirrorTree(pRoot1.left,pRoot2.left)&&isMirrorTree(pRoot1.right,pRoot2.right);
			else{
				return false;}
			}else if(pRoot1==null && pRoot2==null)return true;
			else return false;
		}
		
}
