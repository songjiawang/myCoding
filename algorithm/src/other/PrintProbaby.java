package other;
/**
 * n个色子，打印所有可能出现和的概率
 * @author CQIT
 *
 */
public class PrintProbaby {
	private static void print(int n){
		int[][]dp = new int[n+1][6*n+1];
	    dp[1][1] = 1;
	    dp[1][2] = 1;
	    dp[1][3] = 1;
	    dp[1][4] = 1;
	    dp[1][5] = 1;
	    dp[1][6] = 1;
	    
	    for (int i = 2; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				for (int j2 = 1; j2 <=6&&j-j2>=0; j2++) {
					dp[i][j] += dp[i-1][j-j2];
				}
			}
		}
		for (int i = 0; i < dp[0].length; i++) {
			if(dp[n][i]!=0){
				System.out.printf("%0.4f ",dp[n][i]/Math.pow(6, n) );
			}
		}
		
	}
	public static void main(String[] args) {
		print(2);
	}
}
