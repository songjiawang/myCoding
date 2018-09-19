package newcode_huawei;

import java.util.Scanner;

/**
 * ×Ö·û´®¼Ó½âÃÜ
 * @author purple
 *
 */
public class Demo30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char [] ch1 = sc.nextLine().toCharArray();
			unEncrypt(ch1);			
			
			char [] ch2 = sc.nextLine().toCharArray();
			Encrypt(ch2);
			System.out.println(new String(ch1)+"\n"+new String(ch2));
			
		}
	}
	static void unEncrypt(char[] ch){
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLetter(ch[i])){
				if(ch[i]!='z' && ch[i]!='Z'){
					ch[i] = (char) (ch[i]-'a'<0?(ch[i]+32+1):(ch[i]-32+1));
				}else{
					ch[i] = ch[i]-'a'<0?'a':'A';
				}
			}else if(ch[i]>='0' && ch[i]<='9'){
				ch[i] = (char) (ch[i]=='9'?'0':ch[i]+1);
			}
		}
	}
	
	static void Encrypt(char[] ch){
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLetter(ch[i])){
				if(ch[i]!='a' && ch[i]!='A'){
					ch[i] = (char) (ch[i]-'a'<0?(ch[i]+32-1):(ch[i]-32-1));
				}else{
					ch[i] = ch[i]-'a'<0?'z':'Z';
				}
			}else if(ch[i]>='0' && ch[i]<='9'){
				ch[i] = (char) (ch[i]=='0'?'9':ch[i]-1);
			}
		}
	}
}
