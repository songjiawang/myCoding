package newCodeMuoNiTest;

import java.util.Arrays;
import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[]co = new int[n];
			int tmp;
			for (int i = 0; i < m; i++) {
				tmp	= sc.nextInt();
				tmp--;
				co[tmp]++;
			}
			Arrays.sort(co);
			System.out.println(co[0]);
			
		}
	}
}
