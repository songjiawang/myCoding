package newCodeMuoNiTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 牛牛与世界杯们票
 * @author purple
 *
 */
public class Demo14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt()+1;
			int m = sc.nextInt();
			int k = sc.nextInt();
			TaoC[] ts= new TaoC[m+1];
			int x,y;
			for (int i = 0; i < m; i++) {
				x =sc.nextInt();
				y = sc.nextInt();
				ts[i] = new TaoC(x, y);
			}
			ts[m] = new TaoC(k, 1);
			Arrays.sort(ts);
			
			int dp[] = new int[10*(n)];
			for (int i = 0; i < dp.length; i++) {
				dp[i] = 100000;
			}
			dp[0] = 0;
			dp[1] = k;
			for (int i = 2; i < dp.length; i++) {
				for (int j = 0; j < ts.length && i-ts[j].y>=0; j++) {
					dp[i] = Math.min(dp[i],
							dp[i-ts[j].y]+ts[j].x);
				}
			}
			int[]tmp = Arrays.copyOfRange(dp, n, dp.length);
			Arrays.sort(tmp);
			System.out.println(tmp[0]);
			
		}
	}
}
class TaoC implements Comparable<TaoC>{
	int x;
	int y;
	double w;
	@Override
	public int compareTo(TaoC o) {
		// TODO Auto-generated method stub
		if(this.w>o.w){
			return 1;
		}else if(this.w<o.w){
			return -1;
		}else{
			return 0;
		}
	}
	public TaoC(int x,int y) {
		this.x = x;
		this.y = y;
		this.w = (double)y/(double)x;		
		
		// TODO Auto-generated constructor stub
	}
	
}
