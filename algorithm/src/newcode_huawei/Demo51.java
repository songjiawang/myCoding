package newcode_huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 大数加法
 * @author CQIT
 *
 */
public class Demo51{
	private static String BigNumsAddOrNegitive(String num1,String num2){
		boolean isPositive = true;
		char[]ch1 = num1.toCharArray();
		char[]ch2 = num2.toCharArray();
		if(ch1[0]!='-' && ch2[0]!='-'){
			return BigNumsAdd(ch1,ch2);
		}else if(ch1[0]=='-' && ch2[0]=='-'){
			return "-"+BigNumsAdd(Arrays.copyOfRange(ch1, 1, ch1.length),
								Arrays.copyOfRange(ch2, 1, ch2.length));
		}else if(ch1[0]=='-' && ch2[0]!='-'){
			return BigNumsNegitive(ch2,ch1);
			
		}else{
			return BigNumsNegitive(ch1,ch2);
		}
		
	}
	
	private static String BigNumsNegitive(char[]ch1,char[]ch2){
		boolean negitive = false;
		int index1 = ch1.length-1;
		int index2 = ch2.length-1;
		int co = 0;
		int neg = 0;
		int target = 0;
		
		char[]res = new char[ch1.length>(ch2.length)?ch1.length:ch2.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = '0';
		}
		int i = res.length-1;
		while(index1>=0 && index2>=1){
			if((ch1[index1]-'0'-co)<(ch2[index2]-'0')){
				
				target = 10+ch1[index1]-co-'0'-ch2[index2]+'0';
				co = 1;
				res[i] = (char)(target+'0');
				
			}else{				
				target = ch1[index1]-'0'-co-ch2[index2]+'0';
				co = 0;
				res[i] = (char)(target+'0');
			}
			i--;
			index1--;
			index2--;
		}
		
		while(index1>=0){
			target = ch1[index1]-'0'-co;
			co = 0;
			res[i] = (char)(target+'0');
			i--;
			index1--;
		}
		while(index2>=1){
			negitive = true;
			target = 10-co-ch2[index2]+'0';
			co = 1;
			res[i] = (char)(target+'0');
			i--;
			index2--;
			
		}
		if(co==1){
			negitive = true;
		}
		System.out.println(new String(res));
		String tmp = removePreZero(res);
		System.out.println("tmp: "+tmp);
		if(negitive){
			int len = tmp.length()+1;
			char []ch = new char[len];
			for (int j = 1; j < ch.length; j++) {
				ch[j]='0';
			}
			ch[0] = '1';
			System.out.println(new String(ch));
			System.out.println("-"+tmp);
			return BigNumsNegitive(ch,("-"+tmp).toCharArray());
		}else{
			return tmp;
		}
	
		
	}
	
	private static String BigNumsAdd(char[] ch1, char[] ch2) {
		// TODO Auto-generated method stub
	
		int index1 = ch1.length-1;
		int index2 = ch2.length-1;
		int co = 0;
		int sum = 0;
		int target = 0;
		
		char[]res = new char[(ch1.length>ch2.length?ch1.length:ch2.length)];
		for (int i = 0; i < res.length; i++) {
			res[i] = '0';
		}
		int i = res.length-1;
		while(index1>=0 && index2>=0){
			sum = ch1[index1]-'0'+ch2[index2]-'0'+co;
			target = sum%10;
			co = sum/10;
			res[i] = (char)(target+'0');
			i--;
			index1--;
			index2--;
		}
		while(index1>=0){
			sum = ch1[index1]-'0'+co;
			target = sum%10;
			co = sum/10;
			res[i] = (char)(target+'0');
			i--;
			index1--;
		}
		while(index2>=0){
			sum = ch2[index2]-'0'+co;
			target = sum%10;
			co = sum/10;
			res[i] = (char)(target+'0');
			i--;
			index2--;
		}
		String resString = new String(res);
		if(co!=0){
			return String.valueOf(co)+resString;
		}else{
			return resString;
		}
		
		
	}
	
	private static String removePreZero(char[]chs){
		int index = chs.length-1;
		for (int i = 0; i < chs.length; i++) {
			if(chs[i]!='0'){
				index = i;
				break;
			}
		}
		
		return new String(Arrays.copyOfRange(chs, index, chs.length));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			System.out.println(BigNumsAddOrNegitive(s1,s2));
		}
	}
}
