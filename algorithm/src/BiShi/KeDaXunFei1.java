package BiShi;

import java.util.Arrays;
import java.util.Scanner;

public class KeDaXunFei1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				int n = sc.nextInt();
				int x = sc.nextInt();
				int[]sco = new int[n];
				for (int j = 0; j < n; j++) {
					sco[j] = sc.nextInt();
				}
				Arrays.sort(sco);
				System.out.println(count(sco,n,x,0));
			}
			
		}
	}

	private static int count(int[] sco, int n, int x,int i) {
		// TODO Auto-generated method stub
		
		double avg = 0;
		int sum = 0;		
		for (int j = 0; j < sco.length; j++) {
			sum = sum+sco[j];
		}
		int count = 0;
		avg = ((double)sum)/n;
		if(avg>x){
			return count;
		}else{
			sco[i]=100;
			return 1+count(sco,n,x,i+1);
		}
	}
}
