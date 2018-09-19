package HW;

import java.util.Arrays;
import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[]nums = new int[n];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = sc.nextInt();
			}
			Arrays.sort(nums);
			System.out.println(nums[0]);
			for (int i = 1; i < nums.length; i++) {
				if(nums[i]!=nums[i-1]){
					System.out.println(nums[i]);
				}
			}
			
			
		}
	}
	
	
}
