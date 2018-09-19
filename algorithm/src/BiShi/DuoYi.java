package BiShi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找出 a+b+c=0的所有组合
 * @author CQIT
 *
 */
public class DuoYi {
	public static List<List<Integer>> find(int[]nums){
		List<List<Integer>>res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int start ;
		int len = nums.length;
		int end ;
		//假设i为a+b的相反数
		for (int i = 0; i <len; i++) {
			start = i+1;
			end = len-1;
			while(start<end){
				if(nums[start]+nums[end]==-nums[i]){
					ArrayList<Integer>list = new ArrayList();
					list.add(nums[start]);
					list.add(nums[i]);
					list.add(nums[end]);
					res.add(list);
					while(start<end&&nums[start]==nums[start+1])
						start++;
					while(start<end&&nums[end]==nums[end-1])
						end--;
				}else if(nums[start]+nums[end]>-nums[i]){
					end--;
				}else{
					start++;
				}
				start++;
				end--;
			}
			while(i<len-1&&nums[i]==nums[i+1]){
				i++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[]nums = {1,2,-3};
		List<List<Integer>>res = find(nums);
		for(List l:res){
			System.out.println(l);
		}
	}
}
