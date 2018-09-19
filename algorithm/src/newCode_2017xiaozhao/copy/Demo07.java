package newCode_2017xiaozhao.copy;

import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(count(start,end));
		}
	}
	public static String count(int start,int end){
		StringBuffer sb = new StringBuffer(); 
		String res = null;
		for (int i = start; i <=end; i++) {
			char [] ch = String.valueOf(i).toCharArray();
			int r = 0;
			for (int j = 0; j < ch.length; j++) {
				r = r+(int)Math.pow(ch[j]-'0', 3);
			}
			
			if(r == i) sb.append(i+" ");
		}
		 res = sb.toString().trim();
		 if(res==null || res.equals("")){
			 return "no";
		 }else{
			 return res;
		 }
	}
}
