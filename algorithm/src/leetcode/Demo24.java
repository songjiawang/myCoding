package leetcode;
/*
 * list 中的数两个一组，进行组内交换  不能改变node的值，只是改变其位置
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class Demo24 {
	public ListNode swapPairs(ListNode head) {
        if(head==null)return null;
        ListNode nullHead=new ListNode(0);
        nullHead.next=head;
        ListNode index = nullHead;
        while(index!=null){
	    	if(index.next!=null){
	    		if(index.next.next!=null){
	    		ListNode temp = index.next.next;
	    		index.next.next=index.next.next.next;
	    		temp.next=index.next;
	    		index.next=temp; 
	    		}
	    	}	    	
	    	if(index.next==null){
	            break;
	        }else{
	            index = index.next.next;
	        }
	    }  	
        
        		
		return nullHead.next;
    }
	
	
	
	
	
	class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) { val = x; }
	}
}
