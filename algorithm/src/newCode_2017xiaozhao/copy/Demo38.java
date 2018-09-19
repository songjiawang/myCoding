package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * 数字和为SUM的方法数
 * @author CQIT
 *
 */
public class Demo38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int sum = sc.nextInt();
			int[]A = new int[n];
			for (int i = 0; i < n; i++) {
				A[i] = sc.nextInt();
			}
			
			//**** dp
			int dp[][] = new int[n+1][sum+1];//前i个数字和为j的方案数
			dp[0][0] = 1;						
			for (int i = 1; i < n+1; i++) {
				for (int j = 0; j <sum+1; j++) {
					dp[i][j] = dp[i-1][j];
					if(j-A[i-1]>=0){
						dp[i][j] += dp[i-1][j-A[i-1]] ;
					}	
				}
					
			}			
			System.out.println(dp[n][sum]);
			
			
			
			//****
			 
			
			
		}
	}
}
