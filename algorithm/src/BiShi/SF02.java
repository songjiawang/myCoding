package BiShi;

import java.util.Scanner;

public class SF02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String[]strs = sc.nextLine().split(",");
			int n = Integer.valueOf(sc.nextLine());
			for (int i = 0; i < strs.length; i++) {
				change(strs,i,n);
			}
			for(String s:strs){
				System.out.println(s);
			}
			
			
		}
	}

	private static void change(String[] strs, int i, int n) {
		if(strs.length-1==i){
			return;
		}
		
		// TODO Auto-generated method stub
		String tmp = strs[i];
		if(tmp.length()==n)return;
		int len = tmp.length();
		int co = n-len;
		if(co%2==0){
			int t = co/2;
			for (int j = 0; j < t; j++) {
				tmp = " "+tmp;
			}
			for (int j = 0; j < t; j++) {
				tmp =tmp+" ";
			}
		}else{
			int r = co/2;
			int l = co-r;
			for (int j = 0; j < l; j++) {
				tmp = " "+tmp;
			}
			for (int j = 0; j < r; j++) {
				tmp = tmp+" ";
			}
		}
		strs[i] = tmp;
	}
	
	
}
