package HW;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			if(n==0)continue;
			System.out.println(count(n));
		}
	}
	public static int count(int n){
		if(n<=0)return 0;
		if(n==1)return 0;
		if(n==2)return 1;
		
		return 1+count(n-2);
		
	}
	
}
