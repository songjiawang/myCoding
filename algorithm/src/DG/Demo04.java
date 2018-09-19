package DG;
/**
 * 收集苹果
 * 平面上有N*M个格子，每
 * 个格子中放着一定数量的苹果。从左上角的格子开始， 每一步只能向下走或是向右走，每次走到一个格子就把格子里的苹果收集起来， 这样一直走到右下角，问最多能收集到多少个苹果。
 * @author purple
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		int [][] n = { {5, 8, 5, 7, 1, 8},
			    {1, 3, 2, 8, 7, 9},
			    {7, 8, 6, 6, 8, 7},
			    {9, 9, 8, 1, 6, 3},
			    {2, 4,10, 2, 6, 2},
			    {5, 5, 2, 1, 8, 8}};
		
		//分解子问题 将问题分解成更小的同一子问题 
		//状态dp[i][j] 从0,0 走到 n[i][j]的最大苹果是
		//状态转移方程：dp[i][j] = max{dp[i][j-1],dp[i-1][j]}+n[i][j]; 
		//即能到i,j位置的两个格子中最大的dp加上n[i][j]
		int dp[][] = new int[n.length][n[0].length];
		dp[0][0] = n[0][0];//最右下角的dp为本身
		
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				if(i==0 &&j==0)continue;
				if(i==0){
					dp[i][j] = dp[i][j-1]+n[i][j];
				}else if(j==0){
					dp[i][j] = dp[i-1][j]+n[i][j];
				}else{
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j])+n[i][j];
				}
			}
		}
		System.out.println(dp[5][5]);
	}
}
