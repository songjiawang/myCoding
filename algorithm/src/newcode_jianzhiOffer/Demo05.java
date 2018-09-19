package newcode_jianzhiOffer;

import java.util.Stack;

/*
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 */
public class Demo05 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.empty()){
    		stack2.push(stack1.pop());
    	}
    	int res = stack2.pop();
    	while(!stack2.empty()){
    		stack1.push(stack2.pop());
    	}
    	return res;
    }
}
