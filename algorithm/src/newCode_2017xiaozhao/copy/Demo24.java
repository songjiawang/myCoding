package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * “ÏªÚ
 * @author purple
 *
 */
public class Demo24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int array[] = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = i+1; j < array.length; j++) {
					if((array[i]^array[j])>m){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
