package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Scanner;

public class Demo27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int array[] = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
			Arrays.sort(array);
			int count = count(array);
		}
	}

	private static int count(int[] array) {
		// TODO Auto-generated method stub
		int res = 0;
		int a,b,c;
		for (int i = 0; i < array.length-2;) {
			 a = array[i];
			 b = array[i+1];
			 c = array[i+2];
			 if(b-a<=10 && c-b<=10){
				res++;
				i=i+3; 
			 }else{
				 i++;
			 }
			
		}
		return res;
	}
}
