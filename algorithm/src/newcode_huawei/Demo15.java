package newcode_huawei;

import java.util.Scanner;

/**
 * ����һ��int�͵����������������int���������ڴ��д洢ʱ1�ĸ�����
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
