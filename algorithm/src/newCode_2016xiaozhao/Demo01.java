package newCode_2016xiaozhao;

import java.util.Scanner;

/**
 * 回文串：给定一个字符串，问是否能通过添加一个字母将其变为回文串。
 * 
 * @author purple
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			boolean flag = false;
			char[] ch = sc.nextLine().toCharArray();
			int i = 0;
			int j = ch.length - 1;
			String res = "YSE";
			while (i < j) {
				if (ch[i] != ch[j]) {
					if (flag) {
						res = "No";
						break;
					} else {
						flag = true;
						if (ch[i + 1] == ch[j]) {
							i = i + 1;
						} else if (ch[i] == ch[j - 1]) {
							j = j - 1;
						} else {
							res = "No";
							break;
						}
					}
				} else {
					i++;
					j--;
				}
				res = "YSE";
			}	
			System.out.println(res);
		}
		
	}
}
