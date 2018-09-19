package newCode_2017xiaozhao.copy;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * ÇóºÍ
 * @author CQIT
 *
 */
public class Demo39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
		
		LinkedList<Integer>list = new LinkedList<>();
		//LinkedList<LinkedList<Integer>>res = new LinkedList<>();
		comm(list,m,0,1,n);
		
		//System.out.println("end");
		}
	}
	public static void comm(LinkedList<Integer> list,int m,int sum,int i,int n){
		if(sum==m){
			String str = "";
			for(int tmp:list){
				str = str+tmp+" ";
			}
			System.out.println(str.trim());
		}else if(sum>m){
			
		}else{
			for (int j = i; j <=n; j++) {
				list.add(j);
				sum = sum+j;
				comm(list,m,sum,j+1,n);
				sum = sum-j;
				list.removeLast();
			}
			
		}
		
	}
}
