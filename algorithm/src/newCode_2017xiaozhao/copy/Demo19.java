package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ∆¥¥’√Ê∂Ó
 * @author purple
 *
 */
public class Demo19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			
			System.out.println(count(n));
			
		}
	}
	
	public static long count(int n) {
		long[]dp = new long[10000];
		int[]p = {1,5,10,20,50,100};
		dp[0] = 1;
		
		for (int i = 0; i < p.length; i++) {
			
			for (int j = 1; j < dp.length; j++) {
				if(j-p[i]>=0){
					dp[j]+= dp[j-p[i]];
				}
			}
		}
		
		return dp[n];
	}
}
