package newcode_jianzhiOffer;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * һ�������а����������ҳ�������Ļ�����ڽ�㡣
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
