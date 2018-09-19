package newCode_2017xiaozhao.copy;

import java.util.Scanner;
import java.util.Stack;

/**
 * ¾ä×Ó·­×ª
 * @author purple
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		while(sc.hasNextLine()){
			StringBuffer sb = new StringBuffer();
			String [] str = sc.nextLine().split(" ");
			for(String s:str){
				
				stack.push(s);
			}
			while(!stack.isEmpty()){
				sb.append(stack.pop()+" ");
			}
			System.out.println(sb.toString().trim());
			
		}
	}
}
