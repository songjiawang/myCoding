package newcode_ChengXuYuanMIanShiJInDian;
/**
 * ���ʵ����ڵ��ɾ��
 * @author purple
 *
 */
public class Demo10 {
	public boolean removeNode(ListNode pNode) {
        // write code here
		if(pNode==null || pNode.next == null)return false;
		pNode = pNode.next;
		return true;
    }
}
