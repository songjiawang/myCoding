package newcode_jianzhiOffer;

import com.sun.scenario.effect.impl.prism.ps.PPSBlend_ADDPeer;

/**
 * ������������˫������
 * @author purple
 *
 */
public class Demo65 {
	
	public TreeNode Convert(TreeNode pRootOfTree) {
		
        if(pRootOfTree!=null){
        	Convert(pRootOfTree.left);
        	//
        	if(preNode==null){
        		preNode = pRootOfTree;
        		
        	}else{
        		preNode.right = pRootOfTree;
        		pRootOfTree.left = preNode;
        		preNode = pRootOfTree;
        	}
        	//
        	Convert(pRootOfTree.right);
        }
		
        
        
    }
}
