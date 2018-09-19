package newcode_huawei;

import java.util.Scanner;

/**
 * 他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。
 */
public class Demo21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			System.out.println(shift(str));
		}
		
	}
	static String shift(String str){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='0' && ch<='9'){
				sb.append(ch);
			}else if(ch>='a' && ch<='z'){
				if(ch=='a'|| ch=='b'|| ch=='c'){
					sb.append(2);
				}else if(ch=='d'|| ch=='e'|| ch=='f'){
					sb.append(3);
				}else if(ch=='g'|| ch=='h'|| ch=='i'){
					sb.append(4);
				}else if(ch=='j'|| ch=='k'|| ch=='l'){
					sb.append(5);
				}else if(ch=='m'|| ch=='n'|| ch=='o'){
					sb.append(6);
				}else if(ch=='p'|| ch=='q'|| ch=='r'|| ch=='s'){
					sb.append(7);
				}else if(ch=='t'|| ch=='u'|| ch=='v'){
					sb.append(8);
				}else if(ch=='w'|| ch=='x'|| ch=='y'|| ch=='z'){
					sb.append(9);
				}				
			}else if(ch>='A' && ch<='Z'){
				char tmp = (char)(ch+'a'-'A');
				if(tmp!='z')sb.append((char)(tmp+1));
				else sb.append('a');
			}else{
				
			}
		}
		return sb.toString();
	}
}
