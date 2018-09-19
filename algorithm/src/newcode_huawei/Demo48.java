package newcode_huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * 四则运算
 */
public class Demo48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char[] ch = sc.nextLine().toCharArray();
			System.out.println(backExpressValue(backExpress(ch)));
			
		}
	}
	
	/**
	 * 后缀表达式求值
	 */
	public static int backExpressValue(String str){
		System.out.println(str);
		Stack<Integer> s = new Stack<>();
		String[] e = str.split(" ");
		int i = 0;
		while(i<e.length){
			if(e[i].equals("+")|| e[i].equals("-")||e[i].equals("*")|| e[i].equals("/")){
				int num1 = s.pop();
				int num2 = s.pop();
				String ex = e[i];
				int res = 0;
				switch (ex){
				case "+": res = num2+num1;System.out.println(res+"="+num2+ex+num1);;break;
				case "-": res = num2-num1;System.out.println(res+"="+num2+ex+num1);break;
				case "*": res = num2*num1;System.out.println(res+"="+num2+ex+num1);break;
				case "/": res = num2/num1;System.out.println(res+"="+num2+ex+num1);break;				
				}
				s.push(res);
				System.out.println("pust:"+res);
			}else if(e[i].equals("")){
				
			}else{
				s.push(Integer.parseInt(e[i]));
				System.out.println("pust:"+Integer.parseInt(e[i]));
			}
			i++;
		}
			
		return s.pop();
		
	}
	/**
	 * 中缀表达式专后缀表达式3+2*{1+2*[-4/(8-6)+7]}
	 * @param ch
	 * @return
	 */
	public static String backExpress(char[] ch) {
		Stack<Character> s = new Stack<Character>();
		int i = 0;
		StringBuffer sb = new StringBuffer();
		int co = 1;
		while (i < ch.length) {
			if ((ch[i] >= '0' && ch[i] <= '9')) {
				if(co==1){
					sb.append(ch[i]);
				}else{
					co=1;
					sb.append("-"+ch[i]);
				}
				
			} else if (ch[i] == '(' || ch[i] == '[' || ch[i] =='{') {
				
				s.push(ch[i]);
			} else if (ch[i] == '+') {
				sb.append(" ");
				while (!s.isEmpty()) {
					char tmp = s.peek();
					if (tmp == '+' || tmp == '-' || tmp == '*' || tmp == '/') {
						sb.append(" "+s.pop()+" ");
					}else{
						break;
					}
				}
				s.push(ch[i]);
			} else if (ch[i] == '-') {
				if(i-1>=0 && ((ch[i-1]>='0' && ch[i-1]<='9') || 
                        ch[i-1]=='}'||ch[i-1]==']'||ch[i-1]==')' )){
					sb.append(" ");
					while (!s.isEmpty()) {
						char tmp = s.peek();
						if (tmp == '+' || tmp == '-' || tmp == '*' || tmp == '/') {
							sb.append(" "+s.pop()+" ");
						}else{
							break;
						}
					}
					s.push(ch[i]);
				}else{
					co = -1;
				}
				
				
			}else if (ch[i] == '*' || ch[i] == '/') {
				sb.append(" ");
				while (!s.isEmpty()) {
					char tmp = s.peek();
					if (tmp == '*' || tmp == '/') {
						sb.append(" "+s.pop()+" ");
					}else{
						break;
					}

				}
				s.push(ch[i]);
			} else if (ch[i] == ')') {
				while (!s.isEmpty()) {
					char tmp = s.peek();
					if (tmp != '(') {
						sb.append(" "+s.pop()+" ");
					} else {
						s.pop();
						break;
					}

				}
			} else if (ch[i] == ']') {
				while (!s.isEmpty()) {
					char tmp = s.peek();
					if (tmp != '[') {
						sb.append(" "+s.pop()+" ");
					} else {
						s.pop();
						break;
					}

				}
			}else if (ch[i] == '}') {
				while (!s.isEmpty()) {
					char tmp = s.peek();
					if (tmp != '{') {
						sb.append(" "+s.pop()+" ");
					} else {
						s.pop();
						break;
					}

				}
			}
			i++;
		}
		while (!s.isEmpty()) {
			sb.append(" "+s.pop()+" ");
		}
		return sb.toString().trim();
	}
}
