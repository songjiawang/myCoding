package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 两种排血方法
 * @author purple
 *
 */
public class Demo32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int n = Integer.parseInt(sc.nextLine());
			//int n = sc.nextInt();
			String[]strs1 = new String[n];
			String[]strs2 = new String[n];
			for (int i = 0; i < n; i++) {
				strs2[i]=strs1[i] = sc.nextLine();
				
			}
			Arrays.sort(strs2);
			boolean d = isDirSort(strs1,strs2);
			boolean l = isLenSort(strs1);
			if(d&&l){
				System.out.println("both");
			}else if(d){
				System.out.println("lexicographically");
			}else if(l){
				System.out.println("lengths");
			}else{
				System.out.println("none");
			}
		}
	}

	private static boolean isDirSort(String[] strs1, String[] strs2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < strs2.length; i++) {
			if(!strs1[i].equals(strs2[i])){
				return false;
			}
		}
		return true;
	}

	private static boolean isLenSort(String[] strs) {
		// TODO Auto-generated method stub
		for (int i = 0; i < strs.length-1; i++) {
			if(strs[i].length()>strs[i+1].length()){
				return false;
			}
		}
		return true;
	}
}
