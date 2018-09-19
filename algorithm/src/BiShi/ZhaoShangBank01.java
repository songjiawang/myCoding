package BiShi;

import java.util.Arrays;
import java.util.Scanner;

public class ZhaoShangBank01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String[]strs = sc.nextLine().split(" ");
			int[]g = new int[strs.length];
			for (int i = 0; i < g.length; i++) {
				g[i] = Integer.valueOf(strs[i]);
			}
			Arrays.sort(g);
			strs = sc.nextLine().split(" ");
			int[]s = new int[strs.length];
			for (int i = 0; i < s.length; i++) {
				s[i] = Integer.valueOf(strs[i]);
			}
			Arrays.sort(s);
			int count = 0;
			int j = s.length;
			for (int i = g.length-1; i >=0 && j>=0 ;) {
				if(s[i]>=g[i]){
					count++;
					j--;
					i--;
				}else{
					i--;
				}
			}
			System.out.println(count);
		}
	}
}
