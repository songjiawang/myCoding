package jianzhioffer;
/**
 * 不用加法做加法
 * @author CQIT
 *
 */
public class Demo04 {
	public static int add(int num1,int num2){
		int sum,co;
		
		do{
			sum = num1^num2;
			co = (num1&num2)<<1;
			num1=sum;
			num2=co;
		}while(num2!=0);
		return num1;
	}
	public static void main(String[] args) {
		System.out.println(add(-1,-2));
	}
}
