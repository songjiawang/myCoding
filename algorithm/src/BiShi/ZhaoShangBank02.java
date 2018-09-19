package BiShi;

import java.util.Arrays;
import java.util.Scanner;

public class ZhaoShangBank02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			
			System.out.println(jump(n));
		}
	}
	public static int jump(int n){
		 if(n<=1) return 1;
         return jump(n-1)+jump(n-2);

	}
}
