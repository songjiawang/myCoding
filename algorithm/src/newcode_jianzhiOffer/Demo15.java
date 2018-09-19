package newcode_jianzhiOffer;

/*
 * ����һ��������ת�����������������Ԫ�ء�
 */
public class Demo15 {
	public ListNode ReverseList(ListNode head) {
		if(head==null)return null;
		ListNode nullHead = new ListNode(0);
		ListNode nullHeadIndex = nullHead;
		ListNode end = null;
		ListNode index = head;
		ListNode no = null;
		while (true) {
			index=head;
			while (index.next != end) {
				index = index.next;
			}
			no = new ListNode(index.val);
			nullHeadIndex.next = no;
			nullHeadIndex = nullHeadIndex.next;
			end = index;
			if (end == head) {
				break;
			}
		}
		return nullHead.next;
	}
	
	public ListNode ReverseList2(ListNode head) {
		if(head==null)return null;
		ListNode preNode = head;
		ListNode targetNode = preNode.next;
		ListNode lastNode;
		preNode.next=null;
		while(targetNode!=null){
			lastNode = targetNode.next;
			targetNode.next = preNode;
			preNode = targetNode;
			targetNode = lastNode;
		}
		return preNode;
	}
}
