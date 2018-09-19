package demo01;

import java.util.Scanner;

/**
 * �����
 * ����һ��ֻ��СдӢ���ַ�a,b,c...y,z��ɵ��ַ���S,��S������Ĵ��ĳ���. 
 * ���ľ�������������һ�����ַ���,��aba, abba��
 * @author purple
 *
 */
public class Demo10 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNextLine()){
				char[]ch = sc.nextLine().trim().toCharArray();
				if(ch.length!=0){
				int str = maxHuiWem(ch);
				System.out.println(str);	
				}
			}
		}
		public static int maxHuiWem(char[] ch){
			int len = ch.length;
			int maxLen = 1;

			int dp[][] = new int[len][len];//dp[i][j]=1 �Ӵ�i��jΪ����
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
							
						}
					}
				}
			}
			
			return maxLen;
			
		}
	}
