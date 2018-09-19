package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ½øÖÆ×ª»»
 * @author CQIT
 *
 */
public class Demo40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(shift(n,c));
		}
	}

	private static String shift(int n, int c) {
		// TODO Auto-generated method stub
		char[]ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};
		StringBuffer sb = new StringBuffer();
		int co;
		int S = Math.abs(n);
		while(S!=0){
			co = S%c;
			S = S/c;
			sb.append(ch[co]);
		}
		if(n<0){
			sb.append('-');
		}
		sb.reverse();
		
		return sb.toString();
	}
}
