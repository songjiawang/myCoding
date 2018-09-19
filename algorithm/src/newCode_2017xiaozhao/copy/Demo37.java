package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 最长连续数字串
 * @author CQIT
 *
 */
public class Demo37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char[]ch = sc.nextLine().toCharArray();
			int start = 0;
			int end = 0;
			int maxStart = 0;
			int maxEnd = 0;
			int i = 0;
			while(i<ch.length){
				while(i<ch.length && !(ch[i]>='0' && ch[i]<='9')){
					i++;
				}
				if(i<ch.length){
					start = i;
					end = start;
					while(i<ch.length && ch[i]>='0' && ch[i]<='9'){
						i++;
					}
					end = i-1;
					if(end-start+1>maxEnd-maxStart+1){
						maxEnd = end;
						maxStart = start;
					}
					
				}
			}
			System.out.println(new String(Arrays.copyOfRange(ch,maxStart,maxEnd+1)));
		}
	}
}
