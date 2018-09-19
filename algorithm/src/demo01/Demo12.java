package demo01;

import java.util.Scanner;

/**
 * 统计回文
 * 将字符串B插入字符串A使产生的字符串是一个回文串。你接受花花的请求，帮助她寻找有多少种插入办法可以使新串是一个回文串。
 * 如果字符串B插入的位置不同就考虑为不一样的办法。
 * @author purple
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextLine()){
			String strA = sc.nextLine();
			String strB = sc.nextLine();
			int n = 0;
			for (int i = 0; i <= strA.length(); i++) {
				StringBuffer sb = new StringBuffer(strA);
				sb.insert(0, strB);
				if(isHuiWen(sb.toString())){
					n++;
				}				
			}
			
			System.out.println(n);
		}
	}
	public static boolean isHuiWen(String str){
		for (int i = 0; i < (str.length()/2)+1; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
		
		
}
