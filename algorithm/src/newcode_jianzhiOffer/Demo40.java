package newcode_jianzhiOffer;

import java.util.HashSet;
import java.util.Set;

/**
 * �������������ҳ����ǵĵ�һ��������㡣
 * @author purple
 *
 */
public class Demo40 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1==null || pHead2==null)return null; 
		Set<ListNode> set = new HashSet();
		 
		 while(pHead1!=null){
			 set.add(pHead1);
			 pHead1= pHead1.next;
		 }
		 while(pHead2!=null){
			 if(set.contains(pHead2)){
				 return pHead2;
			 }
			 pHead2 = pHead2.next;
				 
		 }
		 return null;
    }
}
