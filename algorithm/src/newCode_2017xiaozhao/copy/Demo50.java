package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ���ŵĵ�
 * @author CQIT
 *
 */
public class Demo50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n2 = sc.nextInt();
			int count = 0;
			double n = Math.sqrt(n2);
			for (int i = 0; i <n; i++) {
				double j = Math.sqrt(n2-i*i);
				int intj = (int)j;
				if(intj==j){
					count++;
				}
				
			}
			System.out.println(count*4);
			
			
		}
	}
}
