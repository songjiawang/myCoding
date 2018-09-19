package newcode_jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
 * ���ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
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