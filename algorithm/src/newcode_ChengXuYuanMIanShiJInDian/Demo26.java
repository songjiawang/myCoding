package newcode_ChengXuYuanMIanShiJInDian;

/**
 * ÉÏÂ¥ÌÝ
 */
public class Demo26 {
    public static void main(String[] args) {
        System.out.println(Demo26.countWays(36196));
    }
    public static int countWays(int n) {
        // write code here
        long dp[] = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        int[] step = {1,2,3};
        for (int i = 2; i < dp.length; i++) {
			for (int j = 0; j < step.length; j++) {
				if(i-step[j]>=0){
					dp[i]=(dp[i]+dp[i-step[j]])%1000000007;
				}
			}
		}
        return (int)dp[n];
    }
}
