package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * 连续最大和
 * @author CQIT
 *
 */
public class Demo44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			int[]nums = new int[n];
			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt();	
			}
			int max =nums[0];
			int start = -1;
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]>0){
					start = i;
					break;
				}else{
					max = max>nums[i]?max:nums[i];
				}				
			}
			if(start==-1){
				System.out.println(max);
			}else{
				max = nums[start];
				int tmp = max;
				for (int i = start+1; i < nums.length; i++) {
					if(nums[i]+tmp>0){
						tmp = tmp+nums[i];
						max = max>tmp?max:tmp;
					}else{
				
						i++;
						while( i<nums.length && nums[i]<0){
							i++;
						}
						tmp = nums[i];
					}
				}
				
				System.out.println(max);
				
			}
		}
			
	}
}
