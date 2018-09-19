package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 找出n个数里最小的k个
 * @author CQIT
 *
 */
public class Demo36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String[]strs = sc.nextLine().split(" ");
			int[]nums = new int[strs.length-1];
			int k = Integer.parseInt(strs[strs.length-1]);
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			Arrays.sort(nums);
			
			for (int i = 0; i < k-1; i++) {
				System.out.print(nums[i]+" ");
			}
			System.out.print(nums[k-1]);
		}
	}
}
