package newcode_jianzhiOffer;
/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 */


public class Demo14 {
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null)return null;
		if(k<=0)return null;
		int count=1;
		ListNode index=head;
		ListNode desNode=head;
		while(true){
			if(count>k){
				desNode=desNode.next;
			}
			if(index.next!=null){
				index=index.next;
				count++;
			}else{
				if(count<k)return null;
				else{
					return new ListNode(desNode.val);
				}
			}
			
			
			
		}
		
	}
	public ListNode FindKthToHead(ListNode head,int k) {
		if(head==null)return null;
		if(k<=0)return null;
		ListNode index = head;
		while(k!=1){
			if(index!=null)
				index=index.next;
			else break;
			k--;						
		}
		if(k==1){
			return new ListNode(index.val);
		}else return null;
    }
	
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}