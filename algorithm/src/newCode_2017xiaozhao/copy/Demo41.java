package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * Ä©Î²0µÄ¸öÊý
 * @author CQIT
 *
 */
public class Demo41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int count = 0;
			int tmp;
			for (int i = 1; i <=n; i++) {
				tmp = i;
				while(tmp%5==0){
					count++;
					tmp = tmp/5;
				}
			}
			System.out.println(count);
		}
	}
}
