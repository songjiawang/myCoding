package wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			//boolean flag = false;
			String[]strs = sc.nextLine().split(" ");
			int h = Integer.valueOf(sc.nextLine());
			int[]arr = new int[strs.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.valueOf(strs[i]);
			}
			Arrays.sort(arr);
			int max = arr[arr.length-1];
			for (int i = max; i > 1; i--) {
				if(!canEatAll(arr,i,h)){
					System.out.println(i+1);
					
					break;
				}
			}
		}
	}

	private static boolean canEatAll(int[] arr, int i,int h) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int j = 0; j < arr.length; j++) {
			int tmp = arr[j]/i;
			if(arr[j]%i!=0){
				tmp++;
			}
			count +=tmp;
		}
		if(count<=h)return true;
		return false;
	}
}
