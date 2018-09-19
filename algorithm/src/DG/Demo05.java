package DG;
/**
 * 01背包问题：每个物品只有一件供你选择放还是不放
 * @author purple
 *
 */
public class Demo05 {
//	public static void main(String[] args) {
//		int []p = {3,4,5,6};
//		int []w = {2,3,4,5};
//		int SW = 18;
//		//状态dp[i,j] 前i件物品，总重量不超过j的最大价值
//		//状态转移；dp[i,j] = max{dp[i-1,j],dp[i-1,j-w[i]]+p[i]} s.t. j-w[i]>=0 
//		int dp[][] = new int[4][9];
//		for(int i=1;i<4;i++)
//			for(int j=1;j<9;j++){
//				if(w[i]>j){
//					dp[i][j] = dp[i-1][j];
//				}else{
//					if(dp[i-1][j]>dp[i-1][j-w[i]]+p[i]){
//						dp[i][j] = dp[i-1][j];
//					}else{
//						dp[i][j] = dp[i-1][j-w[i]]+p[i];
//					}
//				}
//			}
//		System.out.println(dp[3][8]);
//	}
	
}
