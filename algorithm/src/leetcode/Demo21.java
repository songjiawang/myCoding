package leetcode;

/**
 * 拼接两个有序的list  ，结果依然有序
 * 
 * @author purple
 *
 */
public class Demo21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l1InsertIndex;
		ListNode l2InsertIndex;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		l1InsertIndex = l1;
		l2InsertIndex = l2;
		if (l1.val < l2.val) {
			while (l2 != null) {
				if (l1InsertIndex.next != null) {
					if (l1InsertIndex.next.val > l2.val) {
						ListNode no = new ListNode(l2.val);
						no.next = l1InsertIndex.next;
						l1InsertIndex.next = no;
						
						l2 = l2.next;
					}
					l1InsertIndex = l1InsertIndex.next;
				} else if (l1InsertIndex.next == null) {
					l1InsertIndex.next = l2;
					return l1;
				}

			}
			return l1;
		} else {
			while (l1 != null) {
				if (l2InsertIndex.next != null) {
					if (l2InsertIndex.next.val > l1.val) {
						ListNode no = new ListNode(l1.val);
						no.next = l2InsertIndex.next;
						l2InsertIndex.next = no;
						l1 = l1.next;
					}
					l2InsertIndex = l2InsertIndex.next;
				} else if (l2InsertIndex.next == null) {
					l2InsertIndex.next = l1;
					return l2;
				}

			}
			return l2;
		}
	}
	
	class ListNode {
		int val;
		public ListNode next;
	    public ListNode(int x) {val = x;};
	}
}

