package newcode_jianzhiOffer;

import java.util.Arrays;

/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Demo13 {
	public static void reOrderArray(int [] array) {
		if(array.length==0) return;
		int jIndex=-1;
        for (int i = 0; i < array.length; i++) {
        	int temp=array[i];
        	if(array[i]%2!=0){				
				for (int j = i-1; j>jIndex; j--) {
					array[j+1]=array[j];
				}
				array[jIndex+1]=temp;
				System.out.println(Arrays.toString(array));
				jIndex++;
			}
		}
    }
	
	public static void main(String[] args) {
		int []n={1,2,3,4,5,6,7};
		reOrderArray(n);
		//System.err.println(Arrays.toString(n));
	}
}
