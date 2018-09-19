package leetcode;

import java.util.Arrays;

/*
 * 实现字符串转数字的接口 需要自己考虑所有可能发生的情况
 */
public class Demo08 {
	public static int myAtoi(String str) {
        char[]c = str.toCharArray();
        int sign=1;
        int[]nums=new int[str.length()];
        int temp=0;
        if(str.length()==0){
        	return 0;
        }
        if(c[0]=='-'){
        	sign=1;
        	nums[0]=0;
        	for (int i = 1; i < c.length; i++) {
				if((temp=toNum(c[i]))!=-1){
					nums[i]=temp;
				}else{
					return 0;
				}
			}
        }else if(c[0]=='+'){
        	sign=0;
        	nums[0]=0;
        	for (int i = 1; i < c.length; i++) {
				if((temp=toNum(c[i]))!=-1){
					nums[i]=temp;
				}else{
					return 0;
				}
        	}
        }else{
        	nums=new int[str.length()+1];
        	sign=0;
        	nums[0]=0;
        	for (int i = 0; i < c.length; i++) {
				if((temp=toNum(c[i]))!=-1){
					nums[i+1]=temp;
				}else{
					return 0;
				}
			}
        }
        System.out.println(Arrays.toString(nums));
        int sum=0;
        for (int i = 1; i<nums.length; i++) {
			sum=sum*10+nums[i];
		}
        return (sign>0)?(-1*sum):sum;
        
    }
	public static int toNum(char c){
		if(c<'0' || c>'9'){
			return -1;
		}else{
			return c-'0';
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(myAtoi("+-2"));
	}
}
