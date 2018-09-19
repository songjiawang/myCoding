package newCode_2017xiaozhao.copy;

import java.util.Scanner;


/**
 * 电话号码分身
 * @author purple
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			int [] tmp = new int[10];
			int n = Integer.parseInt(sc.nextLine());
			while(n-->0){
				char ch[] = sc.nextLine().toCharArray();
				for (int i = 0; i < ch.length; i++) {
					if(i=='Z') tmp[0]++;
					else if(i=='O') tmp[1]++;
					else if(i=='O') tmp[1]++;
					else if(i=='O') tmp[1]++;
					else if(i=='O') tmp[1]++;
					else if(i=='O') tmp[1]++;
					else if(i=='O') tmp[1]++;
					else if(i=='O') tmp[1]++;
					else if(i=='O') tmp[1]++;
					else if(i=='O') tmp[1]++;
				}
			}
		}
	}
		
}
