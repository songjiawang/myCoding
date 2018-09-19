package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 反写数字
 * 假设数字为32bit的int 溢出返回为0
 */
//input 123  outpunt  321
//input -123  output  -321
public class Demo07 {
	 public static int reverse(int x) {
		 int factor=x;
		 int remainder = 0;
		 long res = 0 ;
		 while(factor!=0 ){
			 remainder = factor%10;
			 res = res*10+remainder;
			 factor = factor/10;
		 }		 	
		if((res<0 && res+Math.pow(2, 31)<0) || (res>0 && res-Math.pow(2, 31)-1>0)){
			return 0;
		}
		 return (int)res;     
	}
	 public static void main(String[] args) {
		System.out.println(reverse(534236469));
	}
	 
}
