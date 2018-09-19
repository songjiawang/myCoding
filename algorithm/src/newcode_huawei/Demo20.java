package newcode_huawei;

import java.util.Scanner;

/**
1.长度超过8位

2.包括大小写字母.数字.其它符号,以上四种至少三种

3.不能有相同长度超2的子串重复

说明:长度超过2的子串
 * @author purple
 *
 */
public class Demo20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String passWord = sc.nextLine();
			System.out.println(isOk(passWord)?"OK":"NO");
			
		}
	}
	static boolean isOk(String passWord){
		if(passWord.length()<=8)return false;
		int hasBigChar = 0;
		int hasnum = 0;
		int hasSmailChar = 0;
		int hasOtherChar = 0;
				
		for (int i = 0; i < passWord.length(); i++) {
			if(passWord.charAt(i)>'0' && passWord.charAt(i)<'9'){
				hasnum  = 1;
			}else if(passWord.charAt(i)>'a' && passWord.charAt(i)<'z'){
				hasSmailChar  = 1;
			}else if(passWord.charAt(i)>'A' && passWord.charAt(i)<'Z'){
				hasBigChar  = 1;
			}else {
				hasOtherChar  = 1;
			}
		}
		if(hasBigChar+hasnum+hasOtherChar+hasSmailChar<3)return false;
		System.out.println(2);
		for (int i = 0; i < passWord.length()-2; i++) {
			String tmp = passWord.substring(i, i+3);
			for (int j = i+3; j < passWord.length()-2; j++) {
				if(tmp.equals(passWord.substring(j,j+3)))return false;
			}
		}
		
		return true;
	}
}
