package newcode_ChengXuYuanMIanShiJInDian;
/**
 * Á´Ê½A+B
 * @author purple
 *
 */
public class Demo12 {
	public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
		int co = 0;
		ListNode resNodeHead = new ListNode(0);
		ListNode tmp = resNodeHead;
		while(a!=null && b!=null){
			int sum = a.val+b.val+co;
			co = sum/10;
			ListNode res = new ListNode(sum%10);
			tmp.next = res;
			tmp = tmp.next;		
			a = a.next;
			b= b.next;
			
		}
		if(a==null){
			while(b!=null){
				int sum = b.val+co;
				co = sum/10;
				ListNode res = new ListNode(sum%10);
				tmp.next = res;
				tmp = tmp.next;	
				b = b.next;
			}			
		}else if(b==null){
			while(a!=null){
				int sum = a.val+co;
				co = sum/10;
				ListNode res = new ListNode(sum%10);
				tmp.next = res;
				tmp = tmp.next;	
				a = a.next;
			}			
		}	
		if(co!=0){
			ListNode res = new ListNode(co);
			tmp.next = res;
		}
		return resNodeHead.next;
    }
}
