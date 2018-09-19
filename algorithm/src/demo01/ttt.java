package demo01;

import java.util.Arrays;
import java.util.Scanner;

public class ttt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char[]ch = sc.nextLine().toCharArray();
			int res = 0;
			if(ch.length==1){
				res = 0;
			}else if(ch.length==0){
				res = 0;
			}else{
				for (int i = 1; i < ch.length-1; i=i+2) {
					if(ch[i]==ch[i-1] || ch[i]==ch[i+1]){
						res++;
					}
				}
				
				if(ch.length%2==0){
					if(ch[ch.length-1]==ch[ch.length-2] && ch[0]==ch[1])res++;
					//if(ch[ch.length-1]==ch[ch.length-2])res++;
				}
			}
			
			System.out.println(res);
		}
			
			
	}	
	
	
}
