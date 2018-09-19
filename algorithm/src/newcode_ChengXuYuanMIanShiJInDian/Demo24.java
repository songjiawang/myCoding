package newcode_ChengXuYuanMIanShiJInDian;

/**
 * 机器人走方格2
 */
public class Demo24 {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int countWays(int[][] map, int x, int y) {
        // write code here
        int[][]dp = new int[x][y];
        for (int i = 0; i < x; i++) {
			if(map[i][0]==1){
				dp[i][0] = 1;
			}else{
				break;
			}
		}
        
        for (int i = 0; i < y; i++) {
			if(map[0][i]==1){
				dp[0][i] = 1;
			}else{
				break;
			}
		}
        
        for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				if(map[i][j]!=1)continue;
				if(i-1>=0 && map[i-1][j]==1){
					dp[i][j]+=dp[i-1][j];
				}
				
				if(j-1>=0 && map[i][j-1]==1){
					dp[i][j]+=dp[i][j-1];
				}
			}
			
			
		}
        return dp[x-1][y-1]%1000000007;
    }
}
