package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * Êý×Ö·­×ª
 * @author CQIT
 *
 */
public class Demo48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(rev(rev(x)+rev(y)));
		}
		
		//System.out.println(rev(100));
	}
	public static int rev(int n){
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		sb.reverse();
		return Integer.parseInt(sb.toString());
	}
}
