package newcode_huawei;

import java.util.Scanner;

public class Demo39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int high = sc.nextInt();
			getHigh(high,5);
		}
	}
	static void getHigh(int high,int times){
		double [] dp = new double[times+1];
		dp[0] = high;
		for (int i = 1; i < dp.length; i++) {
			dp[i] = dp[i-1]/2;
		}
		double sum = 0;
		for (int j = 1; j < dp.length-1; j++) {
			sum =sum+2*dp[j];
		}
		System.out.println(sum+dp[0]);
		System.out.println(dp[times]);
	}
}
