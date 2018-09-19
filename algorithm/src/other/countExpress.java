package other;

import java.util.Stack;

/**
 * 表达式求值
 * @author purple
 *
 */
public class countExpress {
	public static void main(String[] args) {
		System.out.println(midExpressToENdExpress("(10+20)*4-10/5"));
	}
	/**
	 * 中缀表达式转后缀表达式
	 * @param exp
	 * @return
	 */
	public static String midExpressToENdExpress(String exp){
		StringBuffer sb = new StringBuffer();
		char []ch = exp.toCharArray();
		Stack<Character> s = new Stack();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if(c>='0' && c<='9'){
				sb.append(c);
			}else if(c=='('){
				s.push(c);
			}else if((c=='+' || c=='-')){
				if(s.isEmpty()){
					s.push(c);
				}else{
					while(!s.isEmpty() && s.peek()!='('){
						sb.append(s.pop());
					}
					s.push(c);
				}				
			}else if((c=='*' || c=='/')){
				if(s.isEmpty()){
					s.push(c);
				}else{
					while(!s.isEmpty() && (s.peek()!='(') && (s.peek()=='*' || s.peek()=='/')){
						sb.append(s.pop());
					}
					s.push(c);
				}				
			}else if(c==')'){
				while(!s.isEmpty()&&s.peek()!='('){
					sb.append(s.pop());
				}
				s.pop();
			}
		}
		while(!s.isEmpty()){
			sb.append(s.pop());
		}
		return sb.toString();
	}
}
