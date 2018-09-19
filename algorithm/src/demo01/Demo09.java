package demo01;

import java.util.Scanner;

/**
 * 最长回文
 * 现在给你一个字符串，请你找出其中长度最长的回文。
 * @author purple
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char[]ch = sc.nextLine().toCharArray();
			String str = maxHuiWem(ch);
			System.out.println(str);
		}
	}
	
	public static String maxHuiWem(char[] ch){
		int len = ch.length;
		int maxLen = 1;
		int maxI = 0;
		int maxJ = 0;
		int dp[][] = new int[len][len];//dp[i][j]=1 子串i到j为回文
		dp[0][0]=1;
		for (int j = 0; j < dp.length; j++) {
			for (int i = 0; i <=j; i++) {
				if(i==j){
					dp[i][j]=1;
					continue;
				}
				if(ch[i]!=ch[j]){
					dp[i][j]=0;
					continue;
				}
				
				if(i+1==j){
					dp[i][j]=1;
				}else{
					dp[i][j] = dp[i+1][j-1]==1?1:0;
				}
				if(dp[i][j]==1){
					if(j-i+1>maxLen){
						maxLen = j-i+1;
						maxI = i;
						maxJ = j;
					}
				}
			}
		}
		String res = new String(ch,maxI,maxLen);
		return res;
		
	}
}
