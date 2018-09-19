package jianzhioffer;

import java.util.Scanner;

public class Demo03 {
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(sc.hasNextLine()){
		 int count = 0;
		
			String[]strs = sc.nextLine().split(",");
			for (int i = 0; i < strs.length; i++) {
				if(Integer.valueOf(strs[i])%2!=0){
					count++;
			}
			
			
			
		}
		 System.out.println(count);
	}
	
 }
}
