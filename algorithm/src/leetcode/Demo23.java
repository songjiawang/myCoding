package leetcode;
/*
 * 将k个sorted的list重新sort成一个list
 */
public class Demo23 {
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length==0)return null;
		ListNode res = lists[0]; 
       for (int i = 1; i < lists.length; i++) {
		res = sortTwoList(res,lists[i]);
       }	
		return res;
    }
	
	public ListNode sortTwoList(ListNode listOne,ListNode listTwo){
		if(listOne==null)return listTwo;
		if(listTwo==null)return listOne;
		ListNode l1=listOne;
		ListNode l2= listTwo;
		if(listOne.val<listTwo.val){
			while(l2!=null){
				if(l1.next==null){
					l1.next=l2;
					return listOne;
				}else{
					if(l1.next.val>l2.val){
						ListNode no = new ListNode(l2.val);
						no.next=l1.next;
						l1.next=no;
						l2 = l2.next;
					}
					l1=l1.next;
				}
				
				
			}
			return listOne;
		}else{
			while(l1!=null){
				if(l2.next==null){
					l2.next=l1;
					return l2;
				}else{
					if(l2.next.val>l1.val){
						ListNode no = new ListNode(l1.val);
						no.next=l2.next;
						l2.next=no;
						l1 = l1.next;
					}
					l2=l2.next;
				}
				
				
			}
			return l2;
		}
		
			
	}
	
	
	
	
	
	
	  class ListNode {
		      int val;
		      ListNode next;
		     ListNode(int x) { val = x; }
	  }
}
