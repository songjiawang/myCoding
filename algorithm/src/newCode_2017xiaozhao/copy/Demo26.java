package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ×ÖµäÐò
 * @author purple
 *
 */
public class Demo26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			String[]array = new String[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = (i+1)+"";
			}
			Arrays.sort(array);
			System.out.println(array[m-1]);
			
		}
	}
}
