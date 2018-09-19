package mianjing;

import java.util.HashSet;
import java.util.Set;

/**
 * ÷––À2018java√Ê ‘
 * @author CQIT
 *
 */
public class Demo02 {
	
	private static int maxNumOfApples(int n,int k,int[]appleAtNodes,int[][] edges){
		int[]max = {0};
		Set<Integer>set = new HashSet();
		for (int i = 0; i < appleAtNodes.length; i++) {
			set.add(appleAtNodes[i]);
		}
		boolean[][] flag = new boolean[n+1][n+1];
		for (int i = 1; i <=n; i++) {
			count(set,edges,0,i,flag,max,0);
		}
		
		return max[0];
	}
	private static void count(Set<Integer>set,int[][]edges,int preNodes,int currentNodes,boolean[][]flag,int[]max,int sum){
		if(flag[preNodes][currentNodes]==true){
			return;
		}else{
			flag[preNodes][currentNodes]=true;
			flag[currentNodes][preNodes]=true;
			
		}
		if(set.contains(currentNodes)){
			sum +=1;
		}
		max[0] = max[0]>sum?max[0]:sum;
		for (int i = 0; i < edges.length; i++) {
			if(edges[i][0]==currentNodes && !flag[currentNodes][edges[i][1]]){
				count(set,edges,currentNodes,edges[i][1],flag,max,sum);
			}
			if(edges[i][1]==currentNodes && !flag[edges[i][0]][currentNodes]){
				count(set,edges,currentNodes,edges[i][0],flag,max,sum);
			}
		}
		flag[preNodes][currentNodes]=false;
		flag[currentNodes][preNodes]=false;
	}
	
	public static void main(String[] args) {
		int n = 4;
		int k = 3;
		int[]appleAtNodes = {2,3,4};
		int[][] edges = {{1,2},{1,3},{1,4}};
		System.out.println(maxNumOfApples(n, k, appleAtNodes, edges));
	}
}
