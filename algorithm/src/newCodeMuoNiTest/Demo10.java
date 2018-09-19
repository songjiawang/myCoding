package newCodeMuoNiTest;

import java.util.Scanner;

/**
 * Å£Å£Óëæ¤æ¤
 * @author purple
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int[]vis = new int[14];
			int sum1 = 0;
			int sum2 = 0;
			int sum = 0;
			int sub = 0;
			for (int i = 0; i < 3; i++) {
				int k = sc.nextInt();
				vis[k]++;
				sum1 = sum1+k;
			}
			for (int i = 0; i < 3; i++) {
				int k = sc.nextInt();
				vis[k]++;
				sum2 = sum2+k;
			}
			for (int i = 1; i <=13; i++) {
				if(vis[i]==4){
					continue;
				}else{
					vis[i]++;
					for (int j = 1; j <=13; j++) {
						if(vis[j]==4){
							continue;
						}else{
							sum++;
							if(sum1+i>sum2+j){
								sub++;
							}
						}
					}
					vis[i]--;
				}
				
			}
			double res = (double)sub/(double)sum;
			System.out.printf("%.4f",res);
			
		}
	}
}
