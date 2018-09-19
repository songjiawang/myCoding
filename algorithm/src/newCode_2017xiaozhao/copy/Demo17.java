package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * 整数加法
 * @author purple
 *
 */
public class Demo17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			String str[] = sc.nextLine().split(" ");
			char [] ch1 = str[0].toCharArray();
			char [] ch2 = str[1].toCharArray();
			System.out.println(addChar(ch1, ch2));
		}
	}
	
	public static String addChar(char[]ch1,char[]ch2){
		int i = ch1.length-1;
		int j = ch2.length-1;
	//	System.out.println(i+" "+j);
		char co = '0';
		StringBuffer sb = new StringBuffer();
		int sum = '0';
		char res ;
		char[] tmp;
		while(i>=0 && j>=0){
			if(!isNum(ch1[1]) || !isNum(ch2[1])){
				return "error";
			}
			tmp = charAdd(ch1[i],ch2[j],co);
			co = tmp[0];
			System.out.println(co);
			sb.insert(0,tmp[1]);
			i--;
			j--;
		}
		if(i>=0){
			
			for (int j1 = i; j1 >=0; j1--) {
				if(!isNum(ch1[j1])){
					return "error";
				}
				if(co=='0'){
					sb.insert(0, ch1[j1]);
				}else{
					//System.out.println("aa");
					
					res = (char)((ch1[j1]-'0'+co-'0')%10+(int)'0');
					co = (char)((ch1[j1]-'0'+co-'0')/10+(int)'0');
					sb.insert(0,res);
				}
			}
		}else if(j>=0){
			for (int j1 = i; j1 >=0; j1--) {
				if(!isNum(ch1[j1])){
					return "error";
				}
				if(co=='0'){
					sb.insert(0, ch2[j1]);
				}else{
					//System.out.println("bb");
					
					res = (char)((ch2[j1]-'0'+co-'0')%10+(int)'0');
					co = (char)((ch2[j1]-'0'+co-'0')/10+(int)'0');
					sb.insert(0,res);
				}
			}
		}else{
			if(co!='0'){
				sb.insert(0, co);
			}
		}
		return sb.toString();
	}
	
	public static char[] charAdd(char c1,char c2, char co){
		char[] res = {'0','0'};
		char resCo = '0';
		int sum = 0;
		char ge ;
		sum = c1-'0'+c2-'0'+co-'0';
		resCo = (char)(sum/10+(int)'0');
		ge = (char)(sum%10+(int)'0');
		res[0] = resCo;
		res[1] = ge;
		return res;
		
	}
	
	public static boolean isNum(char c){
		if(c>='0' && c<='9')return true;
		else return false;
	}
}
