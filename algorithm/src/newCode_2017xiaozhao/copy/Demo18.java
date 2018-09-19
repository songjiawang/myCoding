package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * 网格走法数目
 */
public class Demo18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(count(x+1,y+1));
		}
	}
		
	public static int count(int x,int y) {
		int dp[][] = new int[x][y];
		for (int i = 0; i < x; i++) {
			dp[i][0] = 1;
		}
		for (int j = 0; j < y; j++) {
			dp[0][j] = 1;
		}
		
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				if(i-1>=0){
					dp[i][j] +=dp[i-1][j];
				}
				if(j-1>=0){
					dp[i][j]+=dp[i][j-1];
				}
			}
		}
		
		return dp[x-1][y-1];
	}
	
}
