package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ÎÄ¼þºó×º
 * @author purple
 *
 */
public class Demo16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			char[]ch = sc.nextLine().toCharArray();
			int len = ch.length;
			String str = null;
			boolean flag = false;
			for (int i = len-1; i >=0; i--) {
				if(ch[i]=='.'){
					flag = true;
					break;
				}else{
					if(str==null){
	                       str = "";
	                   }
						str =ch[i]+str;
				}
			}
			if(flag){
				System.out.println(str);
			}else{
				System.out.println("null");
			}
			
		}
	}
}
