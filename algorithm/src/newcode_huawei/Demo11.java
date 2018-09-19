package newcode_huawei;

import java.util.Scanner;

/**
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * @author purple
 *
 */
public class Demo11 {
	 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
