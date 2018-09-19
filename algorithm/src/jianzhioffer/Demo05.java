package jianzhioffer;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int minx = Integer.MAX_VALUE;
			int miny = Integer.MAX_VALUE;
			int maxx = Integer.MIN_VALUE;
			int maxy = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				minx = x<minx?x:minx;
				maxx = x>maxx?x:maxx;
				miny = y<miny?y:miny;
				maxy = y>maxy?y:maxy;
			}
			int x = Math.abs((maxx-minx))	;
			int y = Math.abs((maxy-miny))	;
			int res = x>y?x:y;
			res = res*res;
			
			System.out.println(res);
		}
	}
}
