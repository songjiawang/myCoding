package newcode_huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo37 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		while(sc.hasNext()){
			String key  = sc.next();
			char []str = sc.next().toCharArray();
			char []k = clearKey(key.toCharArray()).toCharArray();
			for (int i = 0; i < str.length; i++) {
				if(str[i]==' ')continue;
				if(str[i]<='Z' && str[i]>='A'){
					str[i] = (char) (k[str[i]-'A']-32);
				}else if(str[i]<='z' &&str[i]>='a'){
					str[i] = k[str[i]-'a'];
				}
			}
			
			System.out.println(new String(str));
		}
	}
	static String clearKey(char[]key){
		Set<Character> set  =  new HashSet();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < key.length; i++) {
			char tmp = key[i];
			if(tmp<='Z')tmp = (char) (tmp+32);
			if(!set.contains(tmp)){
				sb.append(tmp);
				set.add(tmp);
			}
		}
		int len = sb.length();
		char tmp  ='a';
		while(len<26){
			if(set.contains(tmp))tmp = (char)(tmp+1);
			else{
				sb.append(tmp);
				set.add(tmp);
				len = len+1;
			}
		}
		return sb.toString();
	}
}
