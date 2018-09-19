package newcode_huawei;

import java.util.Scanner;

/**
 * 从单链表中删除指定值得节点
 * @author purple
 *
 */
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		while(sc.hasNextInt()){
				int num = sc.nextInt();
				ListNode pHead = new ListNode(sc.nextInt());
				num = num-1;
				while(num-->0){
				int key = sc.nextInt();
				int pos = sc.nextInt();
			
				ListNode newNode = new ListNode(key);
				pHead.insert(newNode, pos,pHead);
				ListNode tmp = pHead;
				while(tmp!=null){
					System.out.print(tmp.key+" ");
					tmp = tmp.next;
				}
				}
				int selectKey = sc.nextInt();
				while(pHead!=null){
					if(pHead.key!=selectKey)
					System.out.print(pHead.key+" ");
					pHead = pHead.next;
			}
				System.out.println("\n");
			}
			
		}
			
}

