package BiShi;

import java.util.Arrays;
import java.util.Scanner;

public class KeDaXunFei2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[]ns = new int[n];
			for (int i = 0; i < ns.length; i++) {
				ns[i] = sc.nextInt();
			}
			System.out.println(count(ns,n));
			
		}
			
	}

	private static int count(int[] ns, int n){
		// TODO Auto-generated method stub
		int count = 0;
		boolean[]flag = new boolean[n];
		boolean stop = false;
		boolean[] tmp = new boolean[n];
		while(true){			
			for (int i = 0; i < flag.length; i++) {
				tmp[i] = flag[i];
			}
			for (int i = 0; i < ns.length; i++) {
				if(flag[i]==false){
					for (int j = i+1; j < tmp.length; j++) {
						if(flag[j]==false){
							if(ns[i]>ns[j]){
								tmp[j] = true;
								stop = false;
								
							}
							break;
						}
					}
				}
			}
			for (int i = 0; i < flag.length; i++) {
				flag[i] = tmp[i];
			}
			if(stop==false){
				count++;
			}else{
				break;
			}
			//System.out.println(11);
			stop = true;
		}
		return count;
	}

	
	
}
