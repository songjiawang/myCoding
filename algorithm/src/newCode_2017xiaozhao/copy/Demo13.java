package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * Í³¼Æ×Ö·û
 * @author purple
 *
 */
public class Demo13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextLine()){
			char []ch = sc.nextLine().toCharArray();
			int [] tmpL = new int[26];
			int [] tmpH = new int[26];
			for (int i = 0; i < ch.length; i++) {
				if(Character.isLetter(ch[i])){
					if(ch[i]>='a'){
						tmpL[ch[i]-'a']+=1;
						if(tmpL[ch[i]-'a']==3){
							System.out.println(ch[i]);
							break;
						}
					}else{
						tmpH[ch[i]-'A']+=1;
						if(tmpH[ch[i]-'A']==3){
							System.out.println(ch[i]);
							break;
						}
						
					}
					
				}
			}
		}
	}
}
