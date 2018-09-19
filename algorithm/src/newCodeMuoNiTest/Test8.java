package newCodeMuoNiTest;

import java.util.Scanner;

/**
 * Å£Å£ÕÒ¹¤×÷
 * @author purple
 *
 */
public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m =sc.nextInt();
			int d[][] = new int[n][2];
			int a[] = new int[m];
			int i =0;
			while(n-->0){
				d[i][0] = sc.nextInt();
				d[i][1] = sc.nextInt();
				i++;
			}
			i=0;
			
			while(m-->0){
				a[i] = sc.nextInt();				
				i++;
			}
			
			int max = 0;
			for (int j = 0; j < a.length; j++) {
				max = 0;
				for (int j2 = 0; j2 < d.length; j2++) {
					if(d[j2][0]<=a[j]){
						max = Math.max(max, d[j2][1]);
					}
				}
				System.out.println(max);
			}
			
			
		}
	}

	
}
