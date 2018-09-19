package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ��
 * �ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
 * @author purple
 *
 */
public class Demo49 {
	public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		LinkedList<TreeNode> list = new LinkedList<>();
		ArrayList<ArrayList<Integer>> resList = new ArrayList<>();
		if(pRoot==null)return resList;
		list.add(null);
		list.add(pRoot);
		list.add(null);
		boolean leftToRight = true;
		while(!list.isEmpty()){
			TreeNode node = list.peek();
			if(node==null && leftToRight){
				list.pop();
				ArrayList<Integer> oneList= new ArrayList();
				while(list.peek()!=null){
					TreeNode tnode = list.pop();
					oneList.add(tnode.val);
					if(tnode.left!=null)list.add(tnode.left);
					if(tnode.right!=null) list.add(tnode.right);
				}
				list.add(null);
				resList.add(oneList);
				leftToRight = false;
			}else if(node==null && !leftToRight){
				list.pop();
				ArrayList<Integer> oneList= new ArrayList();
				LinkedList<Integer> tmp  = new LinkedList<>();
				while(list.peek()!=null){
					TreeNode tnode = list.pop();
					tmp.addFirst(tnode.val);
					if(tnode.left!=null)list.add(tnode.left);
					if(tnode.right!=null) list.add(tnode.right);
				}
				oneList.addAll(tmp);
				list.add(null);
				resList.add(oneList);
				leftToRight = true;
			}
			
		}
		
		return resList;
    }
}
