package newcode_ChengXuYuanMIanShiJInDian;

import java.util.LinkedList;

/**
 * 寻找下一节点
 * @author purple
 *
 */
public class Demo23 {
	public int findSucc(TreeNode root, int p) {
        // write code here
		LinkedList<Integer>list = new LinkedList();
		backT(root,root.val==p,list,p);
		return list.peek();
        
    }
	public void backT(TreeNode root,boolean flag,LinkedList<Integer> list,int p){
		if(root!=null){
			backT(root.left,flag,list,p);
			if(flag){
				list.add(root.val);
				flag = false;
				return;
			}else if(root.val==p){
				flag = true;
			}
			backT(root.right,flag,list,p);
		}
	} 
}
