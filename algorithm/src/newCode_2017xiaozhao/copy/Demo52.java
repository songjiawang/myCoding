package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ·ÖÆ»¹û
 * @author CQIT
 *
 */
public class Demo52 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[]nums = new int[n];
			int sum = 0;
		    boolean exit = true;
			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt();
				sum +=nums[i];
			}
			if(sum%n!=0){
				System.out.println(-1);
			}else{
				int avg = sum/n;
				int low=0;
				int high=0;
				int count=0;
				while(low<n && high<n){
					while(low<n&&nums[low]>=avg)low++;
					if(low==n)break;
					while(high<n&&nums[high]<=avg)high++;
					if(high==n)break;
					int co = avg-nums[low];
					if(co%2!=0){
						exit=false;
						break;
					}
					int out;
					if(high>low){
						if(nums[high]<co){
							 out = 2*(nums[high]/2);
							
						}else{
							 out = co;
							
						}
					}else{
						int maxOut = nums[high]-avg;
						if(maxOut%2!=0){
							exit = false;
							break;
						}
						out = maxOut;
					}
					
					nums[high] -= out;
					nums[low] +=out;
					count +=out/2*(Math.abs(low-high));
				}
				
				if(exit){
					System.out.println(count);
				}else{
					System.out.println(-1);
				}
			}
			
		}
	}
	
	
	
	
	
}
