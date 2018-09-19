package map;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *  给定一个无向图和其中的所有边，判断这个图是否所有顶点都是连通的。
 * @author CQIT
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][]map = new int[n+1][n+1];
			for (int i = 0; i < m; i++) {
				int j = sc.nextInt();
				int k = sc.nextInt();
				map[j][k] = 1;
				map[k][j] = 1;
			}
			boolean flag[] = new boolean[n+1];
			LinkedList<Integer>list = new LinkedList();
			list.add(1);
			//BSP(flag,map,list,n);
			DSP(flag,map,1,n);
			boolean res = true;;
			for (int i = 1; i <=n; i++) {
				if(flag[i]==false){
					res = false;
				}
			}
			if(res)System.out.println("YES");
			else System.out.println("NO");
		}
	}

	private static void BSP(boolean[] flag, int[][] map, LinkedList<Integer> list,int n) {
		// TODO Auto-generated method stub
		if(list.size()==0)return;
		int tmp = list.pop();
		if(flag[tmp]==true)return;
		else{
			flag[tmp] = true;
			for (int i = 1; i <=n; i++) {
				if(map[tmp][i]==1 && flag[i]==false){
					list.add(i);
				}
			}
		}
		BSP(flag,map,list,n);
		
	}
	
	private static void DSP(boolean[]flag,int[][]map,int i,int n){
		if(flag[i]==true)return;
		flag[i]=true;
		for (int j = 1; j <=n; j++) {
			if(map[i][j]==1&&flag[j]==false){
				DSP(flag,map,j,n);
			}
		}
	}
}
