package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ªÏ∫œ»º¡œ
 * @author CQIT
 *
 */
public class Demo55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[]ns = new int[n];
			for (int i = 0; i < ns.length; i++) {
				ns[i] = sc.nextInt();
			}
			xor(ns,0,0);
			int count = 0;
			for (int i = 0; i < ns.length; i++) {
				if(ns[i]!=0x00000000)
					count++;
			}
			for(int i:ns){
				System.out.println(i);
			}
			System.out.println(count);
		}
		
	}
	public static void xor(int[]ns,int i,int j){
		boolean  hasOne = false;
		if(j>31)return;
		if(i>=ns.length)return;
		for (int k = i; k < ns.length; k++) {
			int tmp = ns[k];
			if(((tmp>>j)&1)==1){
				hasOne = true;
				swap(ns,k,i);
				break;
			}
		}
		if(hasOne){
			for (int k = i+1; k < ns.length; k++) {
				int tmp = ns[k];
				if(((tmp>>j)&1)==1){
					ns[k] = ns[i]^ns[k];
				}	
			}
		}
		xor(ns,i+1,j+1);
	}
	private static void swap(int[] ns, int k, int i) {
		// TODO Auto-generated method stub
		int tmp = ns[k];
		ns[k] = ns[i];
		ns[i] = tmp;
	}
}
