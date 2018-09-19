package newcode_huawei;

import java.util.Scanner;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 *所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * @author purple
 *
 */
public class Demo13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverse(str));
	}
	public static String reverse(String sentence){
		char c[] = sentence.toCharArray();
		SubReverser(c,0,c.length-1);
		int start = 0;
		int end = 0;
		boolean isStart = false;
		boolean isEnd = false;
		for (int i = 0; i < c.length; i++) {
			if(c[i]!=' ' && !isStart){
				isStart = true;
				start = i;
			}
			if((c[i]==' ') && !isEnd && isStart){
				isEnd = true;
				end = i-1;
			}else if(i==c.length-1 && !isEnd && isStart ){
				isEnd = true;
				end = i;
			}
			if(isEnd && isStart){
				SubReverser(c,start,end);
				isEnd = false;
				isStart = false;
				
			}
		}
		
		return new String(c);
	}
	public static void SubReverser(char[] c, int start,int end){
		if(end<=start)return;
		for (int i = 0; i < (end-start+1)/2; i++) {
			char tmp = c[start+i];
			c[start+i] = c[end-i];
			c[end-i] = tmp;
		}
	}
}
