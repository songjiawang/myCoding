package newCode_2017xiaozhao.copy;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextLine()){
			StringBuffer sb = new StringBuffer();
			
			String str = sc.nextLine();
			int len = str.length();
			String res = null;
			if(len<=6){
				System.out.println(str);
			}else if(len <=14){
				res = str.substring(0, 6)+" "+str.substring(6, len);
				System.out.println(res);
			}else{
				 res = str.substring(0, 6)+" "+str.substring(6, 14)+" "+str.substring(14,len);
				System.out.println(res);
			}
		}
	}
}
