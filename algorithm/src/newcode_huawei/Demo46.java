package newcode_huawei;

import java.util.Scanner;

/**
 * 从单链表中删除指定值得节点
 * @author purple
 *
 */
public class Demo46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){		
			int num = sc.nextInt();
			ListNode pHead = new ListNode(sc.nextInt());
			num--;
			while(num-->0){
				int key  = sc.nextInt();
				int pos = sc.nextInt();
				ListNode newNode = new ListNode(key);	
				pHead = pHead.insert(newNode,pos,pHead);
			}						
			int selectKey = sc.nextInt();				
			while(pHead!=null){
				if(pHead.key!=selectKey)
				System.out.print(pHead.key+" ");
				pHead = pHead.next;
		}
		}
			
	}
}
class ListNode{
	int key;
	ListNode next;
	public ListNode(int key) {
		// TODO Auto-generated constructor stub
		this.key = key;
	}
	
	public ListNode insert(ListNode newNode,int pos,ListNode pHead){
		int targetPos = pos-1;
		ListNode index = new ListNode(0);
		index.next = pHead;
		while(index!=null && targetPos>0){
			index= index.next;
			targetPos--;		
		}
		if(index==null){
			System.out.println("index null");
		}
		newNode.next = index.next;
		index.next = newNode;
		return index.next;
	}
}