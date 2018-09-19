package newCode_2017xiaozhao.copy;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * µÿœ¬√‘π¨
 * @author CQIT
 *
 */
public class Demo42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			int[][]map = new int[n][m];
			int[][]flag = new int[n][m];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[0].length; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			TreeMap<Integer,String>res = new TreeMap();
			LinkedList<String>list = new LinkedList();
			//list.add("[0,0]");
			findPath(map,0,0,p,flag,list,0,n,m,res);
			if(res.isEmpty()){
				System.out.println("Can not escape!");
			}else{
				System.out.println(res.lastEntry().getValue());
			}
		
			
			
		}
	}

	private static void findPath(int[][]map,int i, int j, int p, 
			int[][] flag, LinkedList<String> list, int k,int n, int m, 
			TreeMap<Integer,String>res) {
		// TODO Auto-generated method stub
		if(i<0 || i>=n || j<0 || j>=m)return;
		if(map[i][j]==0)return;
		if(p<0)return;
		if(flag[i][j]==1)return;
		flag[i][j] = 1;
		list.add(",["+i+","+j+"]");
		if(i==k&&j==m-1){			
			res.put(p,print(list));
		}
		findPath(map,i-1,j,p-3,flag,list,k,n,m,res);
		findPath(map,i+1,j,p,flag,list,k,n,m,res);
		findPath(map,i,j-1,p-1,flag,list,k,n,m,res);
		findPath(map,i,j+1,p-1,flag,list,k,n,m,res);
		flag[i][j] = 0;
		list.removeLast();
	}
	private static String print(LinkedList<String> list){
		StringBuffer sb = new StringBuffer();
		for(String l:list){
			sb.append(l);
		}
		sb.deleteCharAt(0);
		return sb.toString();
	}
}
