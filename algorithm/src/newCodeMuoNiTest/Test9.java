package newCodeMuoNiTest;

import java.util.Scanner;

/**
 * Êý¶Ô
 * @author purple
 *
 */
public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int count = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = k; j <= n; j++) {
					if(i%j>=k){
						count++;
					}
				}
			}
			System.out.println(count);
		}
			
	}

	
}
