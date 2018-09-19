package newcode_ChengXuYuanMIanShiJInDian;

/**
 * 机器人走方格
 */
public class Demo27 {
    public static void main(String[] args) {
        System.out.println(countWays(2,2));
    }
    public static int countWays(int x, int y) {
        // write code here
      // x++;
     //  y++;
       int[][]dp = new int[x][y];
       
       for (int i = 0; i < x; i++) {
		dp[i][0] = 1;
	   }
       for (int i = 0; i < y; i++) {
		dp[0][i] = 1;
       }
       
       for (int i = 1; i <x; i++) {
    	   for (int j = 1; j < y; j++) {
				if(i-1>=0){
					dp[i][j] +=dp[i-1][j];
				}
				if(j-1>=0){
					dp[i][j] +=dp[i][j-1];
				}
    	   }
       }
       return dp[x-1][y-1];
    }
}
