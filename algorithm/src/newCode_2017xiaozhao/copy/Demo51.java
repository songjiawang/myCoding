package newCode_2017xiaozhao.copy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ÏÂ³ø·¿
 * @author CQIT
 *
 */
public class Demo51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			Set<String>set = new HashSet<String>();
			while(sc.hasNext()){
				String[]strs = sc.nextLine().split(" ");
				for (int i = 0; i < strs.length; i++) {
					set.add(strs[i]);
				}
			}
			System.out.println(set.size());
			
		}
		
	}
}
