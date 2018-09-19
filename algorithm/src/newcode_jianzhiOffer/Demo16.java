package newcode_jianzhiOffer;
/*
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Demo16 {
	public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode tmp1= new ListNode(0);
        tmp1.next = list1;
        ListNode tmp2= new ListNode(0);
        tmp2.next = list2;
        ListNode min = new ListNode(0);
        ListNode tmp3= min;
        tmp2.next = list2;
        while(tmp1.next!=null || tmp2.next!=null){
        	if(tmp1.next==null){
        		tmp3.next=tmp2.next;
        		return min.next;
        	}
        	if(tmp2.next==null){
        		tmp3.next=tmp1.next;
        		return min.next;
        	}
        	if(tmp1.next.val>tmp2.next.val){
        		tmp3.next = new ListNode(tmp2.next.val);
        		tmp3=tmp3.next;
        		tmp2=tmp2.next;
        	}else{
        		tmp3.next = new ListNode(tmp1.next.val);
        		tmp3=tmp3.next;
        		tmp1=tmp1.next;
        	}
        	
        }
		return min.next;
        
	}
	
	public ListNode Merge2(ListNode list1,ListNode list2) {
        if(list2==null)return list1;
        if(list1==null)return list2;
		ListNode head = null;
		if(list1.val<list2.val){
			head = list1;
			head.next = Merge2(list1.next,list2);
		}else{
			head = list2;
			head.next = Merge2(list1,list2.next);
		}
		return head;
       
	}
	
	public ListNode Merge3(ListNode list1,ListNode list2) {
		  if(list2==null)return list1;
	      if(list1==null)return list2;
	      ListNode head = new ListNode(0);
	      ListNode tmp = head;
	      ListNode index1 = list1;
	      ListNode index2 = list2;
	      while(index1!=null && index2!=null){
	    	  if(index1.val>index2.val){
	    		  head.next=index2;
	    		  index2 = index2.next;
	    		  head = head.next;
	    	  }else{
	    		  head.next = index1;
	    		  index1 = index1.next;
	    		  head = head.next;
	    	  }
	    	  
	      }
	      if(index1!=null){
	    	  head.next = index1;
	      }else if(index2!=null){
	    	  head.next = index2;
	      }
		return tmp.next;
       
	}
}
