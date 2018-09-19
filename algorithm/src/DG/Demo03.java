package DG;
/**
 * 数字三角形:给定一个数字三角形，找到从顶部到底部的最小路径和。每一步可以移动到下面一行的相邻数字上或下面一行的右侧
 * @author purple
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		int[][] n = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		int dp[][] = new int[101][101];
		//状态d[i][j] 从第i行第就列的元素到最后一行的最小路径和
		//状态转移方程：d[i][j] = min{d[i+1][j],d[i+1][j+1]}+n[i][j] 我当前到达最后一行的最小值等于我能到达下一行的两个位置中到达
		//最后一行的最小值+n[i][j]
		dp[n.length-1][0] = 0;
		for (int i = n.length-1; i >=0; i--) {
			for (int j = 0; j < n[i].length; j++) {
				dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1])+n[i][j];			
			}
		}
		System.out.println(dp[0][0]);
	}
}
