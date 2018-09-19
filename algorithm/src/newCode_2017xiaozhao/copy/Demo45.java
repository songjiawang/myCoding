package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ¼ÆËãÌÇ¹û
 * @author CQIT
 *
 */
public class Demo45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int t = sc.nextInt();
			int A = (x+z)/2;
			int B = A-x;
			int C = B-y;
			if(B+C==t){
				System.out.println(A+" "+B+" "+C);
			}else{
				System.out.println("No");
			}
		}
	}
}
