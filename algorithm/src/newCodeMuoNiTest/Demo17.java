package newCodeMuoNiTest;

import java.util.Arrays;
import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int res[] = new int[4];
			 res[0] =a+b+c;
			 res[1] = a*b*c;
			 res[2] = (b+c)*a;
			res[3] = (a+b)*c;
			Arrays.sort(res);
			System.out.println(res[res.length-1]);
		}
	}
}
