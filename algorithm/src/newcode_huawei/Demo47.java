package newcode_huawei;

import java.util.Scanner;

/**
 * 单链表中的倒是第K个节点
 * @author purple
 *
 */
public class Demo47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			ListNode head = new ListNode(0);
			ListNode tmp = head;
			while(n-->0){
				ListNode node = new ListNode(sc.nextInt());
				tmp.next = node;
				tmp = tmp.next;
			}
			int k = sc.nextInt();
			tmp = head;
			ListNode index = null;
			int count = 0;
			while(tmp.next!=null){
				count++;
				if(count==k-1){
					index = head;
					tmp = tmp.next;
					index = index.next;
				}else if(count>k-1){
					index = head;
					tmp = tmp.next;
				}else{
					tmp = tmp.next;
				}
			}
			if(index==null){
				System.out.println(-1);
			}else{
				System.out.println(index.vals); 
			}
		}
	}
	
}
class ListNode{
	int vals;
	ListNode next;
	public ListNode(int vals) {
		// TODO Auto-generated constructor stub
		this.vals = vals;
	}
}