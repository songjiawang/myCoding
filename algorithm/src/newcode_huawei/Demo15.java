package newcode_huawei;

import java.util.Scanner;

/**
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * @author purple
 *
 */
public class Demo15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(countOne(num));
	}
	public static int countOne(int num){
		int count = 0;
		while(num!=0){
			if((num&1)==1){
				count++;
			}
			num = num>>1;
		}
		return count;
		
	}
}
