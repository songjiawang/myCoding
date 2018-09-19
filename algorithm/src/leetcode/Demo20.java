package leetcode;

import java.util.LinkedList;
/*
 * 一个只含有{}[]()的字符串，判断它是否完璧 即（[]）{}...  不能是{（}）
 */
public class Demo20 {
	 public static boolean isValid(String s) {
	    LinkedList<Character> list = new LinkedList<Character> ();
	    char[]c = s.toCharArray();
	    for (int i = 0; i < c.length; i++) {
			if(c[i]=='(' || c[i]=='[' || c[i]=='{'){
				list.add(c[i]);	
				System.out.println(c[i]+"入栈");
			}else{
					if(list.isEmpty()){
						System.out.println("栈空");
						return false;
					}else if(c[i]==list.getLast()+1 || c[i]==list.getLast()+2){
							list.removeLast();
							System.out.println(c[i]+"出栈");
							}else{	
									System.out.println("与栈顶元素不匹配");
									return false;
					}
			    }
					
				
				
					
		} 
	    if(!list.isEmpty()){
	    	return false;
	    }
	    return true;
	    
	 }
	 public static void main(String[] args) {
		System.out.println(isValid("()"));
	}
}
