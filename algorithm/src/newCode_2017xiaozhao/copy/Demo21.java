package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * авдЫЪ§
 * @author purple
 *
 */
public class Demo21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			
		
			int count=0;
			for (int i = 1; i <=n; i++) {
				if(shi(i)==er(i)){
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static int er(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(n>0){			
			if((n&1)==1){
				sum++;
			}			
			n = n>>1;
		}
		
		return sum;
	}

	public static int shi(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(n!=0){
			sum = sum + n%10;
			n = n/10;
		}
		
		return sum;
	}
	
	
}
