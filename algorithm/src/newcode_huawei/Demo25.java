package newcode_huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
		ArrayList<Integer> I = new ArrayList<>();
		ArrayList<Integer> R = new ArrayList<>();
				
		//String[] strI = sc.nextLine().split(" ");	
		//String[] strR = sc.nextLine().split(" ");	
		StringBuffer sb = new StringBuffer();
		int sum = 0;
		int numI = sc.nextInt();
		while(numI-->0){
			I.add(sc.nextInt());
		}
		int numR = sc.nextInt();
		while(numR-->0){
			int n = sc.nextInt();
			if(!R.contains(n))
			R.add(n);
		}	
		Collections.sort(R);	
		for(int des:R){
			LinkedList<Integer>list = new LinkedList();
			int num = 0;
			for(int src:I){
				if(isContian(src,des)){
					if(!list.contains(src))
					list.add(src);					
					num ++;
				}
			}
			if(!list.isEmpty()){
				sb.append(" "+des);
				sb.append(" "+num);
				sum = sum+2;
				for(int key:list){
					sb.append(" "+I.indexOf(key));
					sb.append(" "+key);
					sum = sum+2;
				}			
			}
		}
		System.out.println(sum+sb.toString());
		}
		
	}
	static boolean isContian(int src, int des){
		char[] s = String.valueOf(src).toCharArray();
		char []d = String.valueOf(des).toCharArray();
		boolean flag = true;
		for (int i = 0; i < s.length; i++) {
			if(s[i]==d[0]){
				for (int j = 0; j < d.length; j++) {
					if( i+j>=s.length || s[i+j]!=d[j]){flag = false ;break;}
				}
				if(flag)return true;
				else flag = true;
			}
		}
		return false;
	}
}
