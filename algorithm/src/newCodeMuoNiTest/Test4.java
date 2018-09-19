package newCodeMuoNiTest;

import java.util.Scanner;

/**
 * ≈£≈£¥ÚœÏ÷∏
 * @author purple
 *
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			long n = sc.nextLong();
			System.out.println(count(n));
		}
	}
	
	public static int count(long n){
		int count = 0;
		long res = n;
		while(res!=1){
			if(res%2==0){
				res = res/2;
				count++;
			}else{
				res++;
				count++;
			}
		}
		return count;
	}
}
