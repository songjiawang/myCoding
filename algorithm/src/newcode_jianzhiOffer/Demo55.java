package newcode_jianzhiOffer;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 一个链表中包含环，请找出该链表的环的入口结点。
 * @author purple
 *
 */
public class Demo55 {
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {	ListNode resNode = null;
    HashSet<ListNode> set  = new HashSet();
        while(pHead!=null){
        	if(set.contains(pHead)){
        		resNode = pHead;
        		return resNode;
        	}else{
        		set.add(pHead);
        	}
        	pHead = pHead.next;
        }
        return resNode;
    }
}
