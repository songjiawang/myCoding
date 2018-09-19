package newCodeMuoNiTest;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[]ai = new int[n+1];
			int[]sum = new int[n+1];
			for (int i = 1; i < ai.length; i++) {
				ai[i] = sc.nextInt();
				sum[i] = sum[i-1]+ai[i];
			}
			int m = sc.nextInt();
			int[]qi = new int[m];
			for (int i = 0; i < qi.length; i++) {
				qi[i] = sc.nextInt();
				System.out.println(find(sum,qi[i]));
			}
			
			
		}
	}
	public static int find(int[]arrays,int target){
		for (int i = 1; i < arrays.length; i++) {
			if(arrays[i]>=target){
				return i;
			}
		}
		
		return 0;
	}
}
