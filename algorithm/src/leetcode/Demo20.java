package leetcode;

import java.util.LinkedList;
/*
 * һ��ֻ����{}[]()���ַ������ж����Ƿ���� ����[]��{}...  ������{��}��
 */
public class Demo20 {
	 public static boolean isValid(String s) {
	    LinkedList<Character> list = new LinkedList<Character> ();
	    char[]c = s.toCharArray();
	    for (int i = 0; i < c.length; i++) {
			if(c[i]=='(' || c[i]=='[' || c[i]=='{'){
				list.add(c[i]);	
				System.out.println(c[i]+"��ջ");
			}else{
					if(list.isEmpty()){
						System.out.println("ջ��");
						return false;
					}else if(c[i]==list.getLast()+1 || c[i]==list.getLast()+2){
							list.removeLast();
							System.out.println(c[i]+"��ջ");
							}else{	
									System.out.println("��ջ��Ԫ�ز�ƥ��");
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
