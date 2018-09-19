package newcode_ChengXuYuanMIanShiJInDian;

import java.util.ArrayList;
import java.util.List;

/**
 * ¼ì²éÊÇ·ñÎªBST
 * @author purple
 *
 */
public class Demo22 {
	public boolean checkBST(TreeNode root) {
        // write code here
		ArrayList<Integer>list = new ArrayList();
	backT(root,list);
	for (int i = 1; i < list.size(); i++) {
		if(list.get(i)<list.get(i-1))return false;
	}
	return true;
	}
	public void backT(TreeNode root,List<Integer>list ){
		if(root!=null){
			backT(root.left,list);
			list.add(root.val);
			backT(root.right,list);
		}
	} 
}
