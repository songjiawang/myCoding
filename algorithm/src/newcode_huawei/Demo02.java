package newcode_huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * @author purple
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr = in.nextLine();
		String inChar = in.nextLine();
		char[]inStrChar = inStr.toCharArray();
		char inchar = inChar.charAt(0);
		int count=0;
		for(char c: inStrChar){
			if(c==inchar||c==inchar+32 || c==inchar-32)count++;
		}
		System.out.println(count);
		
	}
}
