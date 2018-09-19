package newcode_jianzhiOffer;
/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author purple
 *
 */
public class Demo51 {
	public static int Add(int num1,int num2) {
        while(num2!=0){
        	int tmp=num1^num2;
        	int co = num1&num2;
        	num2 = co<<1;
        	num1 = tmp;
        }
        return num1;
    }
	 
	public static void main(String[] args) {
		System.out.println(Add(111,89));
	}
}
