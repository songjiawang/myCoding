package HW;

import java.util.Arrays;
import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int buf[] = new int[256];
		for (int i = 0; i <= 9; i++) {
			buf['0'+i] = i;
		}
		for (int i = 0; i < 25; i++) {
			buf['A'+i] = 10+i;
		}
		while(sc.hasNextLine()){
			char[] chs = sc.nextLine().toCharArray();
			System.out.println(count(chs,chs.length,buf));
		}
	}
	
	public static int count(char[]chs,int len,int[]buf){
		int co = 0;
		int res = 0;
		for (int i = len-1; i >1; i--) {
			res = res + (int)Math.pow(16, co)*buf[chs[i]];
			System.out.println((int)Math.pow(16, co)*buf[chs[i]]);
			co++;
		}
		return res;
	}
	
	
}
