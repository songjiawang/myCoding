package DG;
/**
 * 最长递增子序列问题
 * @author purple
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		int[]n = {5,3,4,8,6,7};
		int []dp = new int[n.length];
		dp[0] = 1;//dp[i] 状态。以i个数为结尾的子串中的最大递增小序列
		          //状态转移方程：dp[i] = max{ dp[j]+1};其中n[j]<n[i]
		for (int i = 1; i < dp.length; i++) {
			dp[i] = dp[i-1];
			for (int j = 0; j <=i-1; j++) {
				if(n[j]<n[i]){
					dp[i] = dp[i]>dp[j]+1?dp[i]:dp[j]+1;
				}
			}
		}
		System.out.println(dp[n.length-1]);
	}
}
