package newcode_huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：
 * @author purple
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char [] c = str.toCharArray();
		for (int i = 0; i < c.length/2; i++) {
			char tmp = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = tmp;			
		}
		System.out.println(new String(c));
	}
}
