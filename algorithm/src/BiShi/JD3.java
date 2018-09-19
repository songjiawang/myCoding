package BiShi;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class JD3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int t= sc.nextInt();
			for (int i = 0; i < t; i++) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				int[][]map = new int[n+1][n+1];
				for (int j = 0; j < m; j++) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					map[x][y] = 1;
					map[y][x] = 1;
				}
				int[][] notLink = new int[n+1][];
				LinkedList<Integer>tmp = new LinkedList<>();

				for (int j2 = 2; j2 < n; j2++) {					
					if(map[1][j2]!=1){
							tmp.add(j2);
					}
						
				}
				boolean flag = true;
				for(int t2:tmp){
					for (int j2 = 1; j2 < n; j2++) {					
						if(map[t2][j2]!=1 &&j2!=t2){
								if(!tmp.contains(j2)){
									flag = false;
									break;
								}
						}
							
					}
				}
				if(flag==true){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
					
			}
				
			
		}
	}
}
