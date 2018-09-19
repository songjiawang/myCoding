package newcode_ChengXuYuanMIanShiJInDian;
/**
 * Á´±í·Ö¸î
 * @author purple
 *
 */
public class Demo11 {
	public ListNode partition(ListNode pHead, int x) {
        // write code here
		
		ListNode lastNode = pHead;
		while(lastNode.next!=null){
			lastNode = lastNode.next;
		}
		ListNode head = new ListNode(0);
		head.next = pHead;
		ListNode index=head;
		ListNode endNode = lastNode;
		while(index.next!=endNode){
			if(index.next.val>=x){			
				lastNode.next = index.next;
				index.next = index.next.next;
				lastNode = lastNode.next;
				lastNode.next = null;
			}else{
				index = index.next;
			}
		}
		if(index.next.val>=x){
			lastNode.next = index.next;
			index.next = index.next.next;
			lastNode = lastNode.next;
			lastNode.next = null;
		}
		return head.next;
		
    }
}
