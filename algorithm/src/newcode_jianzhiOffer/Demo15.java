package newcode_jianzhiOffer;

/*
 * 输入一个链表，反转链表后，输出链表的所有元素。
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
