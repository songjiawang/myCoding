package newCodeMuoNiTest;

import java.util.Scanner;

/**
 * 牛牛买股票
 * @author purple
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] dt = new int[n][2];
			int i = 0;
			while(n-->0){				
				dt[i][0] = sc.nextInt();
				dt[i][1] = sc.nextInt();
				i++;
			}
			
			int dp[] = new int[1005];//dp[i]:借i块钱的最大收益
			for (int j = 0; j < dp.length; j++)dp[j] = j;		
			for (int i1 = 0; i1 < dp.length; i1++) {			
				for (int j = 0; j < dt.length; j++) {
					if(i1>=dt[j][0]){
						dp[i1] = Math.max(dp[i1], dp[i1-dt[j][0]]+dt[j][1]);
					}
					
				}
			}
			System.out.println(dp[m]-m);
		}
	}
}
