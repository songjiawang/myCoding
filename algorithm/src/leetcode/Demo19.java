package leetcode;
/*
 * 给一list数，和n  删除倒数第n个数
 * Given n will always be valid.
 *Try to do this in one pass.
 */
public class Demo19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode index = head;
		ListNode preNode=head;
		ListNode posNode=head;
		ListNode desNode=head;
		int count=1;
		while(true){
			if(count>n-1){
				  posNode=posNode.next;
			}
			if(count>n){
				desNode = desNode.next;
			}
			if(count>n+1){
				preNode = preNode.next;
			}
			if(index.next!=null){
				count++;
				index = index.next;
			}else{
				break;
			}								
		}		
		if(desNode==preNode){
			return desNode.next;
		}else if(posNode==desNode){
			preNode.next=null;
			return head;
		}else{
			preNode.next=posNode;
			return head;
		}		
    }
	
	

	 class ListNode {
		  int val;
		  ListNode next;
	      ListNode(int x) { val = x;}
	
	 }
	 
	 
	 
}
