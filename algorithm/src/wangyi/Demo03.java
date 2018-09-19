package wangyi;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String[]strs = sc.nextLine().split(" ");
			int[]arr = new int[strs.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.valueOf(strs[i]);
			}
			System.out.println(value(arr));
		}
		
	}

	public static int value(int[] arr) {
		if (arr == null || arr.length < 1)
			return -1;
		int maxValue = 0;
		int curValue = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				curValue = arr[j] - arr[i];
				if (curValue > maxValue) {
					maxValue = curValue;
				}
			}
		}
		return maxValue;
	}

}
