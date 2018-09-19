package serach;
/**
 * ¶ş·Ö²éÕÒ
 * @author CQIT
 *
 */
public class midSerach {
	private static int serach(int[]nums,int n,int k){
		if(n<=0)return -1;
		int start = 0;
		int end = n-1;
		int mid;
		while(start<=end){
			mid = (start+end)/2;
			int val = nums[mid];
			if(val==k){
				return mid;
			}else if(val>k){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {0,1};
		System.out.println(serach(nums, nums.length, 1));
	}
}
