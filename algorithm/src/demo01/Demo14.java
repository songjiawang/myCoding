package demo01;
/**
 * ������Ľṹ
 * ����һ�����������һ��ʱ�临�Ӷ�ΪO(n),����ռ临�Ӷ�ΪO(1)���㷨���ж����Ƿ�Ϊ���Ľṹ��

����һ�������ͷָ��A���뷵��һ��boolֵ���������Ƿ�Ϊ���Ľṹ����֤������С�ڵ���900��

����������
 * @author purple
 *
 */
public class Demo14 {
	public boolean chkPalindrome(ListNode A) {
        // write code here
		if(A==null)return false;
		ListNode fast = A;
		ListNode slow = A;
		while(fast!=null && fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode tmp = slow.next;
		ListNode last = slow.next;
		while(tmp.next!=null){
			ListNode t = tmp.next;
			tmp.next = t.next;
			t.next = last;
			last = t;
		}
		while(last!=null){
			if(last.val!=A.val)return false;
			last = last.next;
			A = A.next;
		}
		return true;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}