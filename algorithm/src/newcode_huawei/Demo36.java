package newcode_huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ÉßÐÎ¾ØÕó
 * @author purple
 *
 */
public class Demo36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int num = sc.nextInt();		
			she(num);
		}
	}
	static void she(int n){
		int[][]res = new int[n][];
		for (int i = 0; i < n; i++) {
			res[i] = new int[n-i];
		}
		res[0][0] = 1;
		for (int i = 0; i < res.length; i++) {
			int co = i+2;

			for (int j = 0; j < res[i].length; j++) {
				if(i==0 &&j==0)continue;
				if(j==0){res[i][j] = res[i-1][0]+i;continue;}			 
				res[i][j] = res[i][j-1]+co;
				co = co+1;
			}
		}
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]);
				if(j!=res[i].length-1){
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
	}
	
	
}
