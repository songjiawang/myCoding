package newCode_2017xiaozhao.copy;

import java.util.HashSet;
import java.util.Scanner;

/**
 * авдЫДќзг
 * @author CQIT
 *
 */
public class Demo54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int p[] = new int[n];
			for (int i = 0; i < p.length; i++) {
				p[i]= sc.nextInt();
			}
			long sum = 0;
			long produce = 1;
			for(int i:p){
				sum +=i;
				produce *=i;
			}
			
			HashSet<String>setRes = new HashSet();
			int res = 0;
			if(sum>produce){
				res = 1;
				setRes.add(sum+produce+"");
			}
			for (int i = 0; i < p.length; i++) {
				res = res+removeRes(sum,produce,p,i,setRes);
			}
			System.out.println(res);
		}
	}

	private static int removeRes(long sum, long produce, int[] p, int i, HashSet<String> setRes) {
		// TODO Auto-generated method stub
		int res = 0;
		if(sum-p[i]>produce/p[i] && !setRes.contains((sum-p[i])+(produce/p[i])+"")){
			res = 1;
			setRes.add((sum-p[i])+(produce/p[i])+"");
		}
			
		for (int j = i+1; j < p.length; j++) {
			res = res+removeRes(sum-p[i],produce/p[i],p,j,setRes);
		}
		return res;
	}	
	
}
