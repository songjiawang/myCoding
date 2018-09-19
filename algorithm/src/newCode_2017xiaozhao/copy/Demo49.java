package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ºÚ°µ×Ö·û´®
 * 
 * @author CQIT
 *
 */
public class Demo49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			long[] res = new long[1];
			StringBuffer sb = new StringBuffer();
			count(sb,res,n);
			System.out.println((int)(Math.pow(3, n)-res[0]));
			;
		}
		
	}

	private static void count(StringBuffer sb, long[] res, int n) {
		// TODO Auto-generated method stub
		if(sb.length()>n)return;
		
		if(!isBlackString(sb.toString())){
			res[0] += Math.pow(3, n-sb.length());
			//System.out.println("not black: "+sb.toString());
			return;
		}else{
			//System.out.println("is black: "+sb.toString());
			for (int i = 0; i < 3; i++) {
				sb.append((char)('A'+i));
				count(sb,res,n);
				sb.deleteCharAt(sb.length()-1);
			}
		}

	}

	public static boolean isBlackString(String str) {
		char[] ch = str.toCharArray();
		if(str.length()<3)return true;
		int index = ch.length - 1;
		if (ch[index] != ch[index - 1] && ch[index] != ch[index - 2] && ch[index - 1] != ch[index - 2]) {
			return false;
		}
		return true;
	}
}
