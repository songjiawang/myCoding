package newcode_jianzhiOffer;

import java.util.LinkedList;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，
 * 返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * @author purple
 *
 */
public class Demo48 {
	public ListNode deleteDuplication(ListNode pHead){
		LinkedList<Integer> list1 = new LinkedList();
		LinkedList<Integer> list2 = new LinkedList<>();
		while(pHead!=null){
			if(list1.contains(pHead.val)){
				list1.add(pHead.val);
				if(list2.contains(pHead.val)){
					list2.remove(list2.indexOf(pHead.val));
				}
			}else{
				list1.add(pHead.val);
				list2.add(pHead.val);
			}
			pHead= pHead.next;
		}
		ListNode head = new ListNode(0);
		ListNode tmp = head;
		for(int i:list2){
			ListNode node = new ListNode(i);
			tmp.next=node;
			tmp = tmp.next;
		}
		return head.next;
    }
	
	
	public ListNode deleteDuplication2(ListNode pHead){
		if(pHead==null)return null;
		boolean flag  = false;
		ListNode RHead = new ListNode(0);
		ListNode pre = RHead;
		pre.next = pHead;
		ListNode index = pre.next;
		while(index!=null){
			if(flag){
				while(index.next!=null && index.next.val==index.val){
					index = index.next;
				}
				pre.next = index.next;
				index = index.next;
				flag = false;
			}else{
				if(index.next!=null && index.next.val == index.val){
					flag = true;
				}else{
					pre = pre.next;
					index = index.next;
				}
			}
		}
		return RHead.next;
	}
}
