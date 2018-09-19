package wangyi;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			char[]chs = str.toCharArray();
			if(chs.length<2){System.out.println(0);}
			else{
				
				int start = 1;
				int count = 0;
				int end = 0;
				while(start<chs.length){
					for (; start < chs.length; start++) {
						if(chs[start]!=chs[0])break;
					}
					if(start>=chs.length)break;
					
					end = start;
					for (; end < chs.length; end++) {
						if(chs[end]==chs[0])break;
					}
					if(end>=chs.length)break;
					swap(chs,start,end);
					count += end-start;
					start++;
				}
				System.out.println(count);
				
				
			}
		}
	}
	public static void swap(char[]n,int i,int j){
		char tmp = n[i];
		n[i] = n[j];
		n[j] = tmp;
	}
	
}
