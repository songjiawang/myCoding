package BiShi;

import java.util.Scanner;

public class JD2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n  = sc.nextInt();
			int[][] date = new int[n][3];		
			for (int i = 0; i < n; i++) {
				int a  = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();	
				date[i][0] =a ;
				date[i][1] =b ;
				date[i][2] =c ;
				
			}
			int count = 0;
			boolean[]flag = new boolean[n];
			for (int i = 0; i < date.length; i++) {
				if(flag[i]==true)continue;
				for (int j = i; j < date.length; j++) {
					if(i==j)continue;
					if(flag[j]==true)continue;
					if(flag[i]==true)break;
					if(date[i][0]<date[j][0]&&date[i][1]<date[j][1]&&
							date[i][2]<date[j][2]){
						flag[i] = true;
						count++;
						continue;
					}
					if(date[i][0]>date[j][0]&&date[i][1]>date[j][1]&&
							date[i][2]>date[j][2]){
						flag[j] = true;
						count++;
						continue;
					}
				}
			}
			System.out.println(count);
			
		}
	}
}
