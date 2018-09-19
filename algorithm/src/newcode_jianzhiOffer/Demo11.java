package newcode_jianzhiOffer;
/*
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Demo11 {
	public int NumberOf1(int n) {
		int count=0;
		while(n!=0){
			if((n&1)==1)count++;
			n=n>>>1;
			
//>>> 无符号右移，右端补0：>>有符号右移右端补符号位
		}
		return count;
    }
}
