package demo01;

import java.util.Scanner;

/**
 * 素数回文
 * 找出某个范围内的素数回文数，请你写个程序找出 a 跟b 之间满足条件的数。(5 <= a < b <= 100,000,000); 
 * @author purple
 *
 */
public class Demo18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int start = sc.nextInt();
			int end= sc.nextInt();
			for (int i = start; i <= end; i++) {
				if(isSuShu(i)&&isHuiWen(String.valueOf(i))){
					System.out.println(i);
				}
			}
		}
	}
	public static boolean isSuShu(int n){
		for (int i = 2; i <=Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static boolean isHuiWen(String str){
		for (int i = 0; i < (str.length()/2)+1; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
}
