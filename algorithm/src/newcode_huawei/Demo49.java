package newcode_huawei;

import java.util.Scanner;

/**
 * Ìô7
 * @author purple
 *
 */
public class Demo49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int res=0;
			int n = sc.nextInt();
			if(n>=7){
				for (int i = 7; i <=n; i++) {
					if(i%7==0 || String.valueOf(i).contains("7"))res++;
								
				}
			}
			System.out.println(res);
		}
	}
}