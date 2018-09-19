package newCodeMuoNiTest;

import java.util.Scanner;

/**
 * Å£Å£ÊýÐÇÐÇ
 * @author purple
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[][]map = new int[1009][1009];
			int num[][] = new int[1009][1009];
			int l,k;
			int i1,j1,i2,j2;
			for (int i = 0; i < n; i++) {
				l =sc.nextInt();
				k = sc.nextInt();
				map[l][k] = 1;
			}
			for (int i = 1; i < 1009; i++) {
				for (int j = 1; j < 1009; j++) {
					num[i][j] = num[i][j-1]+num[i-1][j]+map[i][j]-num[i-1][j-1];
				}
			}
			n =sc.nextInt();
			for (int i = 0; i < n; i++) {
				i1 = sc.nextInt();
				j1 = sc.nextInt();
				i2 = sc.nextInt();
				j2 = sc.nextInt();
				System.out.println(num[i2][j2]-num[i2][j1-1]-num[i1-1][j2]+num[i1-1][j1-1]);
			}
		}
	}
}
