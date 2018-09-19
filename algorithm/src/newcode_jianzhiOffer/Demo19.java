package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;



/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * @author purple
 *
 */
public class Demo19 {
		Stack<Integer> s = new Stack<Integer>();
	public void push(int node) {
       s.push(node);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
      return s.peek();
    }
    
    public int min() {
        int min=top();
        int tmp=top();
         Iterator<Integer>it = s.iterator();
         while(it.hasNext()){
        	 tmp=it.next();
        	 if(tmp<min)min=tmp;
         }
         return min;
    }
}
