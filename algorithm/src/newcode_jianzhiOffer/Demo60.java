package newcode_jianzhiOffer;

public class Demo60 {
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		if(pNode.right!=null){
			TreeLinkNode tmp  = pNode.right;
			while(tmp.left!=null){
				tmp = tmp.left;
			}
			return tmp;
		}
		TreeLinkNode fatherNode  = pNode.next;
		if(fatherNode ==null)return null;
		TreeLinkNode childerNode  = pNode;		
		while(fatherNode.left!=childerNode){
			TreeLinkNode tmp = fatherNode;
			fatherNode = fatherNode.next;
			childerNode = tmp;
			if(fatherNode==null)return null;
		}
		return fatherNode;
		
    }
	
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}