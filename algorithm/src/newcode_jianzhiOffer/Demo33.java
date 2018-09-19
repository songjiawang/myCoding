package newcode_jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * 
 * @author purple
 *
 */
public class Demo33 {
	public RandomListNode Clone(RandomListNode pHead) {
		RandomListNode resNode = new RandomListNode(0);
		RandomListNode tmp = resNode;
		Map<RandomListNode, RandomListNode> map = new HashMap();

		while (pHead != null) {
			if (map.containsKey(pHead)) {
				RandomListNode node = map.get(pHead);
				if (pHead.random != null) {
					if (!map.containsKey(pHead.random)) {
						RandomListNode rnode = new RandomListNode(pHead.random.label);
						map.put(pHead.random, rnode);
						node.random = rnode;
					} else {
						node.random = map.get(pHead.random);
					}
				}
				tmp.next = node;
				tmp = tmp.next;
			} else {
				RandomListNode node = new RandomListNode(pHead.label);
				if (pHead.random != null) {
					if (!map.containsKey(pHead.random)) {
						RandomListNode rnode = new RandomListNode(pHead.random.label);
						map.put(pHead.random, rnode);
						node.random = rnode;
					} else {
						node.random = map.get(pHead.random);
					}
				}
				map.put(pHead, node);
				tmp.next = node;
				tmp = tmp.next;
			}

			pHead = pHead.next;
		}
		return resNode.next;
	}
	

}

class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label) {
		this.label = label;
	}
}