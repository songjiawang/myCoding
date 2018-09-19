package HW;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char[]chs = sc.nextLine().toCharArray();
			Set<Character>set =new HashSet();
			StringBuffer sb = new StringBuffer();
			for(char c:chs){
				if(!set.contains(c)){
					sb.append(c);
					set.add(c);
				}
			}
			System.out.println(new String(sb));
		}
	}
}
