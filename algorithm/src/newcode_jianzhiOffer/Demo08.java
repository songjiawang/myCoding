package newcode_jianzhiOffer;
/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Demo08 {
	 public static int JumpFloor(int target) {
		
		 return jump(target);	
		 
	 }
	 public static int  jump(int n){
		 int count=0;
		 if(n<=0) return 1;
		 if(n>=2){
			 count= count+jump(n-2);
			 count=count+jump(n-1);
		 }
		 if(n==1){
			 
			 count=count+jump(n-1);
		 }
		 
		 return count;
	 }
	 public static void main(String[] args) {
		System.out.println(JumpFloor(2));
	}
}
