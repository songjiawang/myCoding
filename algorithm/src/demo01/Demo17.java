package demo01;

import java.util.Scanner;

/**
 * 回文数猜想
 * 任取一个正整数，如果不是回文数，将该数与他的倒序数相加，
 * 若其和不是回文数，则重复上述步骤，一直到获得回文数为止。例如：68变成154（68+86），
 * 再变成605（154+451），最后变成1111（605+506），而1111是回文数。
 * 于是有数学家提出一个猜想：不论开始是什么正整数，在经过有限次正序数和倒序数相加的步骤后，
 * 都会得到一个回文数。至今为止还不知道这个猜想是对还是错。现在请你编程序验证之。
 * @author purple
 *
 */
public class Demo17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();

			int count = 0;
			String process = str;
			int tmp = Integer.parseInt(str);
			int add = 0;
			while(!isHuiWen(str)){
				StringBuffer sb = new StringBuffer(str);
				sb.reverse();
				int reTmp = Integer.parseInt(sb.toString());
				add = tmp+reTmp;
				tmp = add;
				str = String.valueOf(add);
				process = process+"--->"+str;
				count++;
			}
			System.out.println(process);
			System.out.println(count);
		}
	}
	public static boolean isHuiWen(String str){
		for (int i = 0; i < (str.length()/2)+1; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
}
