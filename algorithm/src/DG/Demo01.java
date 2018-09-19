package DG;
/**
 * 硬币找零问题（最少找零数）
 * @author purple
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		int []size = {1,3,5};
		int sum = 11;
		int []dp = new int[sum+1];
		dp[0] = 0;//状态dp[i] ;找i元需要最小的硬币数
				//状态转移方程：dp[i] = min{dp[i-size[j]} s.t. i-size[j]>=0
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = 0; j < size.length; j++) {
				if(i>=size[j] && dp[i]>dp[i-size[j]]+1){
					dp[i] = dp[i-size[j]]+1;
				}
			}
		}
		System.out.println(dp[sum]);
	}
}
