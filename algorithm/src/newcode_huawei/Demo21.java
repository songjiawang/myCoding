package newcode_huawei;

import java.util.Scanner;

/**
 * ������ô�任�ģ���Ҷ�֪���ֻ��ϵ���ĸ�� 1--1�� abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,����ô�򵥣�Ԩ�Ӱ������г��ֵ�Сд��ĸ����ɶ�Ӧ�����֣����ֺ������ķ��Ŷ������任��
������������û�пո񣬶������г��ֵĴ�д��ĸ����Сд֮��������һλ���磺X���ȱ��Сд����������һλ��������y����򵥰ɡ���ס��z��������aŶ��
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
