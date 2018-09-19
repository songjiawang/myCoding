package leetcode;
/*
 * 给sorted的list 去除重复的元素，返回长度，不要使用额外的space
 */
public class Demo26 {
	//68ms
	 public int removeDuplicates(int[] nums) {
	    if(nums.length==0)return 0;
	    int len = nums.length;
		 for (int i = 1; i < len;) {
			if(nums[i]==nums[i-1]){
				for (int j = i; j < len; j++) {
					nums[j-1]=nums[j];
					
				}
				len=len-1;
			}else{
				i++;
			}
		}  
		 return len;
	 }
	 
	 
	 
		 
		 
}
