package newcode_jianzhiOffer;
/**
 *�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * @author purple
 *
 */
public class Demo17 {
	   public boolean HasSubtree(TreeNode root1,TreeNode root2) {
	       if(root2==null)return false;
	       if(root1==null)return false;
	       boolean flag = false;
	       if(root1.val==root2.val){
	    	   flag = isSubtree(root1, root2);
	       }
	       if(!flag){
	    	   flag = HasSubtree(root1.left, root2);
	    	   if(!flag){
	    		   flag = HasSubtree(root1.right, root2);
	    	   }
	       }
		   
		   return flag;
	   }
	   public boolean isSubtree(TreeNode root1,TreeNode root2) {
		   if(root2==null)return true;
		   if(root1==null && root2!=null)return false;
		  
		   if(root1.val==root2.val)
			   return isSubtree(root1.left,root2.left) 
						 && isSubtree(root1.right,root2.right);
		   else return false;
			   
		   
	   }
}
