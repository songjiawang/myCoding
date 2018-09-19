package newCode_2017xiaozhao.copy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * É¾³ý¹«¹²×Ö·û´®
 * @author CQIT
 *
 */
public class Demo33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char[]ch1 = sc.nextLine().toCharArray();
			char[]ch2 =  sc.nextLine().toCharArray();
			StringBuffer sb = new StringBuffer();
			Set<Character> set = new HashSet();
			for (int i = 0; i < ch2.length; i++) {
				set.add(ch2[i]);
			}
			for (int i = 0; i < ch1.length; i++) {
				if(!set.contains(ch1[i])){
					sb.append(ch1[i]);
				}
			}
			System.out.println(sb.toString());
		}
	}
}
