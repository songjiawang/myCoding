package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * µ¹ÖÃ×Ö·û´®
 * @author CQIT
 *
 */
public class Demo34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char[]ch = sc.nextLine().toCharArray();
			reTurnString(ch, 0, ch.length-1);
			int start=0,end=0;
			while(true){
				while(end<ch.length&&ch[end]!=' ' && end+1!=ch.length){
					end++;
				}
				
				if(end+1==ch.length){
					System.out.println(start+" "+end);
					reTurnString(ch, start, end);					
					break;
				}else if(ch[end]==' '){
					System.out.println(start+" "+(end-1));
					reTurnString(ch, start, end-1);
					start = end+1;
					end = end+1;
					System.out.println(new String(ch));
				}else{
					break;
				}
				
				
			}
			System.out.println(new String(ch));
		}
	}
	public static void reTurnString(char[]ch ,int start,int end){
		char tmp;
		for (int i = 0; i <=(end-start)/2; i++) {
			tmp = ch[start+i];
			ch[start+i]=ch[end-i];
			ch[end-i]=tmp;
		}
		System.out.println(new String(ch));
	}
}
