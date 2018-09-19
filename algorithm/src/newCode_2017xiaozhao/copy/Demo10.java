package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ´üÊó¹ýºÓ
 * 
 * @author purple
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int []power = new int[n];
			int len = n;
			int i = 0;
			LinkedList<Integer> res = new LinkedList<>();
			while(n-->0){
				power[i] = sc.nextInt();
				i++;
			}
			System.out.println(jump(power,len));
			
		
		}
	}
	
	public static int  jump(int []power,int n){
		int dp[] = new int[n];
		if(power[n-1]!=0)dp[n-1] = 1;
		else{
			dp[n-1] = 1000;
		}
		
		for (int i = n-2; i >=0; i--) {
			dp[i] = 10000;
			int p = power[i];
			if(p==0)continue;
			
			if(i+p>=n)dp[i] = 1;
			else{
				for (int j = i; j < dp.length && j<=i+p; j++) {
					dp[i] = Math.min(dp[i], dp[j]+1);
				}
			}
			
		}
		
		if(dp[0]==10000)return -1;
		else{
			return dp[0];
		}
		
	} 
}
