package newcode_huawei;

import java.util.Scanner;

/**
 * д��һ�����򣬽���һ���ַ�����Ȼ��������ַ�����ת����ַ��������磺
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
