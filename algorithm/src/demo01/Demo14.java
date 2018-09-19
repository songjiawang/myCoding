package demo01;
/**
 * 链表回文结构
 * 对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。

给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。

测试样例：
 * @author purple
 *
 */
public class Demo14 {
	public boolean chkPalindrome(ListNode A) {
        // write code here
		if(A==null)return false;
		ListNode fast = A;
		ListNode slow = A;
		while(fast!=null && fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode tmp = slow.next;
		ListNode last = slow.next;
		while(tmp.next!=null){
			ListNode t = tmp.next;
			tmp.next = t.next;
			t.next = last;
			last = t;
		}
		while(last!=null){
			if(last.val!=A.val)return false;
			last = last.next;
			A = A.next;
		}
		return true;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}