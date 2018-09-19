package newcode_ChengXuYuanMIanShiJInDian;

import java.util.Stack;

/**
 * »ØÎÄÁ´±í
 * @author purple
 *
 */
public class Demo13 {
	public boolean isPalindrome(ListNode pHead) {
        // write code here
		int len = 0;
		ListNode tmp = pHead;
		while(tmp!=null){
			tmp = tmp.next;
			len++;
		}
		tmp = pHead;
		Stack<ListNode> stack = new Stack();
		int halfOfLen = len/2;
		while(halfOfLen>0){
		stack.push(tmp);
		tmp = tmp.next;
		halfOfLen--;
		}
		if(len%2!=0)tmp = tmp.next;
		while(!stack.isEmpty()){
			if(stack.pop().val!=tmp.val)return false;
			tmp = tmp.next;
		}
	return true;
	}
}
