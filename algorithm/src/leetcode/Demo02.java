package leetcode;
/**
 * 给两个非空的list list为非负的int 求和  list 长短不一
 * @author purple
 *
 */
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
public class Demo02 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode((l1.val+l2.val)%10);
		ListNode tempRes = res,tempL1 = l1,tempL2=l2;
		
		int co=(l1.val+l2.val)/10;
		
		while(tempL1.next!=null && tempL2.next!=null){
			tempL1=tempL1.next;
			tempL2=tempL2.next;
			tempRes.next = new ListNode((tempL1.val+tempL2.val+co)%10);
			co=(tempL1.val+tempL2.val+co)/10;	
			tempRes = tempRes.next;
		}
		while(tempL1.next!=null){
			tempL1=tempL1.next;
			tempRes.next = new ListNode((tempL1.val+co)%10);
			co=(tempL1.val+co)/10;
			tempRes = tempRes.next;
		}
		while(tempL2.next!=null){
			tempL2 = tempL2.next;
			tempRes.next = new ListNode((tempL2.val+co)%10);
			co=(tempL2.val+co)/10;
			tempRes = tempRes.next;
			
		}
		if(co!=0){
			tempRes.next = new ListNode(co);
		}
		return res;
	}
}
class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	 }