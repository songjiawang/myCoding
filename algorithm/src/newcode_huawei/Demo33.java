package newcode_huawei;

import java.util.Scanner;

/**
 * 字符串运用 密码截取（最长回文子串）
 * @author purple
 *
 */
public class Demo33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char ch[] = sc.nextLine().toCharArray();
			System.out.println(maxHuiWen(ch));
		}
		
	}
	static int maxHuiWen(char[] ch){
		//dp[i][j]:从i到j是否为回文；
		//dp[i][j] = dp[i+1][j-1]&&dp[i]==dp[j]
		boolean [][]dp = new boolean[ch.length][ch.length];
		
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = true;
		}
		int max = 0;
		for (int j = 0; j < dp.length; j++) {
			for (int i = j; i >=0; i--) {
				if(i==j)dp[i][j] = true;
				else if(j-i>=2){
					dp[i][j] = dp[i+1][j-1]&&(ch[i]==ch[j]);
				}else{
					dp[i][j] = (ch[i]==ch[j]);
				}
				if(dp[i][j]){
					max = max>(j-i+1)?max:(j-i+1);
				}
				
			}
		}
		
		
		return max;
	}
}
