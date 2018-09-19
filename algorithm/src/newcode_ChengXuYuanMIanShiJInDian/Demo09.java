package newcode_ChengXuYuanMIanShiJInDian;
/**
 * 倒数第K个节点
 * @author purple
 *
 */
public class Demo09 {
	 public ListNode FindKthToTail(ListNode head,int k){
		 ListNode index = null;
		 ListNode kNode = null;
		 ListNode tmp = head;
		 int count = 0;
		 if(k ==0)return null;
		 while(tmp!=null){
			 index = tmp;
			 count++;
			 if(count==k){
				 kNode = head;
				 tmp = tmp.next;
			 }else if(count>k){
				 kNode = kNode.next;
				 tmp = tmp.next;
			 }else{
				 tmp = tmp.next;
			 }
			 
		 }
		
		
		 return kNode;
	 }
}
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}