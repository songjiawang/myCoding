package newcode_huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * 
 * @author purple
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String in = sc.nextLine();
			int j = in.length() - 1;
			int i = 0;
			int sum = 0;
			while (in.charAt(j) != 'x') {
				char c = in.charAt(j);
				
				if (c >= '0' && c <= '9') {
					sum = (int) (sum + Math.pow(16, i) * (c - '0'));
				} else {
					sum = (int) (sum + Math.pow(16, i) * (c - ('A' - 10)));
				}
				i++;
				j--;
			}

			
			System.out.println(sum);
			//System.out.println(Integer.parseInt(in.substring(2), 16));//直接使用java自带的函数求解
		}
	}
}
