package newCode_2016xiaozhao;

import java.util.Scanner;

/**
 * ���Ĵ�������һ���ַ��������Ƿ���ͨ�����һ����ĸ�����Ϊ���Ĵ���
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
