package leetcode;
/**
 * 给定一个数组，返回两个索引，要求索引的值之和为给定的一个数
 * You may assume that each input would have exactly one solution, and you may not use 
 * the same element twice.
 * @author purple
 *
 */
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
public class Demo01 {
	 public int[] twoSum(int[] nums, int target) {
	        int i,j;
	        int[] res = new int[2];
	        for(i=0;i<nums.length;i++){
	        	for(j=i+1;j<nums.length;j++){
	        		if(i!=j && nums[i]+nums[j]==target){
	        			res[0]=i;
	        			res[1]=j;
	        			break;
	        		}
	        	}
	        }
	        	
	        return res;
	    }
}
