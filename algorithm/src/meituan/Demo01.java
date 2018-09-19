package meituan;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[][]e = new int[n+1][n+1];
			for (int i = 0; i < n-1; i++) {
				int k = sc.nextInt();
				int j  = sc.nextInt();
				e[k][j] = 1;
				
			}
			boolean[]book = new boolean[n+1];
			int res[] = new int[1];
			res[0] = Integer.MAX_VALUE;
			for (int i = 1; i < n; i++) {
				count(book,res,e,i,0,n,0);
			}
			System.out.println(res[0]);
		}
	}

	private static void count(boolean[] flag, int[] res, int[][] map, int index,int currentNum,int n,int currentPath) {
		// TODO Auto-generated method stub
		   int i;
		    if (n == currentNum) //判断是否到达了目标城市
		    {


		        if (res[0] > currentPath)  //更新最小路径
		        {
		        	res[0] = currentPath;
		        }
		        return;
		    }


		    for (i = 1; i <= n; ++i)  //从1号城市到n号城市依次尝试
		    {
		        //判断当前城市cur到城市i是否有路，并判断城市i是否在已走过的路径中
		        if (map[currentNum][i] != 1 && flag[i] == false)
		        {
		        	flag[i] = true;//标记城市i已经在路径中
		           
		        	count(flag,res,map,i,currentNum+1,n,currentPath+1);
		            flag[i] = false;         /// 之前一部探索完毕后,取消对城市 i 的标记以便另一条路径选择顶点
		           
		        }
		    }

	}
	
	
}
