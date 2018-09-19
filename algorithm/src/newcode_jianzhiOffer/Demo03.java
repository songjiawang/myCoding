package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/*
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
 */
public class Demo03 {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (listNode == null)
			return list;
		ListNode end = null;
		while (true) {
			ListNode index = listNode;
			while (index.next != end) {
				index = index.next;
			}
			end=index;
			if (index == listNode) {
				list.add(index.val);
				return list;
			} else {
				list.add(index.val);
			}
		}

	}

	class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
