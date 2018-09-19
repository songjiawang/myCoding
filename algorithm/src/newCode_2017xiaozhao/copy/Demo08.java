package newCode_2017xiaozhao.copy;
/**
 * 求数列和
 */
import java.util.Scanner;

public class Demo08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			double start = sc.nextInt();
			int n = sc.nextInt();
			double sum = start;
			n=n-1;
			while(n-->0){
				sum = sum+Math.sqrt(start);
				start = Math.sqrt(start);
			}
			// System.out.printf("%.2f", sum);
			 System.out.printf("%.2f", sum);
		}
			
	}
}
