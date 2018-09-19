package leetcode;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 给n个数，要求取3个数的list 要求a+b+c=0, set且不能重复
 */
public class Demo15 {
	
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        List<Integer>listNode = null;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length ; k++) {
					if(nums[i]+nums[j]+nums[k]==0){
						listNode = new ArrayList<Integer>();
						int temp;
						int max=(temp=nums[i]>nums[j]?nums[i]:nums[j])>nums[k]?temp:nums[k];
						int min=(temp=nums[i]<nums[j]?nums[i]:nums[j])<nums[k]?temp:nums[k];
						int mid=0-max-min;
						listNode.add(max); 
						listNode.add(mid);
						listNode.add(min);
						if(!include(resList,listNode)){
							resList.add(listNode);
							System.out.println(listNode.toString());
						}
					}
				}
			}
		
		}
                return resList;
	}
    private static boolean include(List<List<Integer>> resList, List<Integer> listNode) {
		// TODO Auto-generated method stub
    	for(List list:resList){
				if(listNode.get(0)==list.get(0) && listNode.get(1)==list.get(1)){
					return true;
				}
			
    	}
		return false;
	}	
	public static void main(String[] args) {
		int[]nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum2(nums));
	}
	public static List<List<Integer>> threeSum2(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
	    List<Integer>listNode = null;
		int positiveIndex = 0;
		int negativeIndex = 0;
		int k;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]<=0 && nums[i+1]>0){
				positiveIndex = i+1;
				negativeIndex = i;
				break;
			}
		}
		System.out.println(positiveIndex+","+negativeIndex);
		for (int i = 0; i<=negativeIndex;i++) {
			if(i>=1)
			if(nums[i]==nums[i-1])continue;
			
			for (int j = i+1; j <nums.length;j++) {
				if(j>=i+2)
				if(nums[j]==nums[j-1])continue;
				
				if(j<positiveIndex && nums[j]!=0){
					k=positiveIndex;
				}else{
					k=j+1;
				}
				int temp=k;
				for(;k<nums.length;k++) {	
					if(k>=temp+1)
					if(nums[k]==nums[k-1])continue;
					if(nums[i]+nums[j]+nums[k]==0){
						listNode = new ArrayList<Integer>();
						listNode.add(nums[i]); 
						listNode.add(nums[j]);
						listNode.add(nums[k]);
						resList.add(listNode);						
					}
				}
			}
			
		}
		
		return resList;
	}
	
}
