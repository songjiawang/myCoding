package leetcode;
/*
 * 移去list中值等于val的元素，返回长度。
 */
public class Demo27 {
	public int removeElement(int[] nums, int val) {
	        if(nums.length==0)return 0;
			int len = nums.length;
			
			for (int i = 0; i < len;) {
				if(nums[i]==val){
					for (int j = i+1; j < len; j++) {
						nums[j-1]=nums[j];
					}
					len--;
				}else{
					i++;
				}
			}
	        
	        return len;  
    }
}
