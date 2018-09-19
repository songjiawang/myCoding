package newcode_huawei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ãû×ÖÆ¯ÁÁ¶È
 * @author purple
 *
 */
public class Demo44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num = sc.nextInt();
			while(num-->0){
				String name = sc.next();
				System.out.println(nice(name));
			}
		}
		
	}
	static int nice(String name){
		int[]tmp = new int[26];
		char[]ch = name.toCharArray();
		for(char key:ch){
			if(key<='Z')key = (char) (key+32);
	        tmp[key-'a']++;
		}
		Arrays.sort(tmp);
		
		int sum = 0;
		for (int i = 0; i < tmp.length; i++) {
			sum = sum+(i+1)*tmp[i];
		}
		return sum;
		
	}
}
