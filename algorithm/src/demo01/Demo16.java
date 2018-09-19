package demo01;
/**
 * 最长回文串
 * 对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。

给定字符串A以及它的长度n，请返回最长回文子串的长度。
 * @author purple
 *
 */
public class Demo16 {
	public int getLongestPalindrome(String A, int n) {
        // write code here
		char[] ch = A.toCharArray();
		int dp[][] = new int[n][n];
		dp[0][0] = 1;
		int maxLen = 1;
		for (int j = 0; j < dp.length; j++) {
			for (int i = 0; i <=j; i++) {
				if(i==j){
					dp[i][j] = 1;
				}
				if(ch[i]!=ch[j]){
					dp[i][j] = 0;
				}
				if(i+1==j){
					dp[i][j]= 1;
				}else{
					dp[i][j]= dp[i+1][j-1];
				}
				if(dp[i][j]==1){
					maxLen = maxLen>(j-i+1)?maxLen:(j-i+1);
				}
			}
		}
		return maxLen;
    }
}
