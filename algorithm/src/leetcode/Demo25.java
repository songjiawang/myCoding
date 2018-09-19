package leetcode;

/*
 * 给sorted 的list ,每k个node反转以此，不够k个不必反转
 * Given this linked list: 1->2->3->4->5

 *For k = 2, you should return: 2->1->4->3->5
 *For k = 3, you should return: 3->2->1->4->5
 */
public class Demo25 {
	public ListNode reverseKGroup(ListNode head, int k) {
		if (head == null)
			return null;
		ListNode nullHead = new ListNode(0);
		ListNode index = nullHead;
		boolean isKnode = false;
		nullHead.next = head;
		isKnode = true;	
		while (index!=null){
			ListNode temp = index;
			isKnode=false;
			for (int i = 0; i < k; i++) {
				if(temp.next==null){
					System.out.println("没有"+k+"个node");
					return nullHead.next;
				}else{
					temp=temp.next;
				}
			}
			isKnode=true;
			System.out.println("还有"+k+"个node");
			
			exchange(index,temp,k);									
			
		}			
			return nullHead.next;
	}

	private void exchange(ListNode index, ListNode temp, int k) {
		ListNode posNode = temp.next;
		
			
		
			for (int i = 0; i <k-1; i++) {
				temp.next=index.next;
				index.next=temp;
				index=index.next;
				for (int j = 0; j <k-i-1; j++) {
					temp = temp.next;
				}
				index=index.next;
			
			}
			index=index.next;
			temp.next.next=posNode;
		
	}	
	

	

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
