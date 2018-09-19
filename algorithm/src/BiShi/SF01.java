package BiShi;

import java.util.Scanner;

public class SF01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char[]chs = sc.nextLine().toCharArray();
			System.out.println(find(chs));
		}
	}
	
	public static String find(char[]chs){
		StringBuffer start = new StringBuffer();
		StringBuffer mid = new StringBuffer();
		StringBuffer end = new StringBuffer();
		String res = "";
		int i = 1;
		start.append(chs[0]);
		while(i<chs.length&&chs[i]==chs[i-1]){
			start.append(chs[i]);
			i++;
		}
		mid.append(chs[i]);
		i++;
		while(i<chs.length&&chs[i]==chs[i-1]){
			mid.append(chs[i]);
			i++;
		}
		end.append(chs[i]);
		i++;
		while(i<chs.length&&chs[i]==chs[i-1]){
			end.append(chs[i]);
			i++;
		}
		//System.out.println(start.toString());
		//System.out.println(mid.toString());
		//System.out.println(end.toString());
		String tmp = null;
		tmp = isShangJIeGun(start.toString(),mid.toString(),end.toString());
		if(tmp!=null&&tmp.length()>res.length()){
			res = tmp;
		}
		//System.out.println(tmp);
		while(i<chs.length){
			
			
			start = mid;
			mid = end;
			end = new StringBuffer();
			//System.out.println(1);
			end.append(chs[i]);
			i++;
			while(i<chs.length&&chs[i]==chs[i-1]){
				end.append(chs[i]);
				i++;
			}
			tmp = isShangJIeGun(start.toString(),mid.toString(),end.toString());
			if(tmp!=null&&tmp.length()>res.length()){
				res = tmp;
			}
		}
		return res;
	}
	//aabcccdeeea
	public static String isShangJIeGun(String start,String mid,String end) {
		if(end.length()==0)return null;
		int min = Math.min(start.length(), end.length());
		if(mid.length()>min)return null;
		String tmp = start+mid+end;
		char[]chs = tmp.toCharArray();
		if(start.length()==end.length()){
			return tmp;
		}else if(start.length()<end.length()){
			return String.valueOf(chs, 0, 2*min+mid.length());
		}else{
			int co = start.length()-end.length();
	    	int sum = start.length()+end.length()+mid.length();
			return String.valueOf(chs,co, 2*min+mid.length());
		}
	}
}
