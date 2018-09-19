package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * 进制均值
 * @author purple
 *
 */
public class Demo22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			int k = n-2;
			int sum = 0;
			for (int i = 2; i <= n-1; i++) {
				sum = sum+addJinZhi(n, i);
			}
			int max = maxYue(k,sum);
			
			System.out.println(sum/max+"/"+k/max);
		}
	}
	
	public static int addJinZhi(int n,int k){
		int sum = 0;
		while(n>0){
			
			sum =sum+n%k;
			n = n/k;
		}
		
		//System.out.println(k+"进制："+sum);
		return sum;
	}
	
	public static int maxYue(int n1,int n2){
		int min = Math.min(n1, n2);
		for (int i = min; i >=1; i--) {
			if(n1%i==0 && n2%i==0){
				return i;
			}
		}
		return 1;
	}
}
