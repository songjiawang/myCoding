package leetcode;

import java.util.Arrays;

/*
 * 给两个以排序的arrays 求两组数的中为数
 */
public class Demo04 {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	     int[]res = new int[nums1.length+nums2.length];
	     if(nums1.length!=0)
	     for (int i = 0; i < nums1.length; i++) {
			res[i]=nums1[i];
		 }
	     int len=nums1.length;
	     int index=0;
	     boolean flag=false;
		 for (int i = 0; i < nums2.length; i++) {
			for (int j = index; j < len; j++) {
				if(nums2[i]<res[j]){	
					for(int t=len-1;t>=j;t--){
						res[t+1]=res[t];
					}
					res[j]=nums2[i];
					len++;
					index=j;
					flag=true;
					break;
				}
			}
			if(!flag){
				res[len]=nums2[i];
				index=len;
				len++;				
			}
			flag=false;	
		}   
		 System.out.println(Arrays.toString(res));
		if(res.length%2==0){
			return (res[res.length/2]+res[(res.length/2)-1])/2.0;
		}else{
			return res[res.length/2];
		}
	
	 }
	 public static void main(String[] args) {
		 int[]num1={1,2};
		 int[]num2={3,4};
		 System.out.println(findMedianSortedArrays(num1,num2));
	}
}
