package newcode_huawei;

import java.util.Scanner;

/**
 * ¶ÁÓ¢ÓïÊı×Ö
 * @author purple
 *
 */
public class Demo42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			Long num = sc.nextLong();
			String sNum = String.valueOf(num);
			double sp = (sNum.length())/3.0;
			int n = sp==(int)sp?(int)sp:(int)sp+1;
			String []arrays = new String[n];
			int end = sNum.length();
			int start = end-3;
			for (int i = arrays.length-1; i >=0; i--) {
				if(start<0)arrays[i] = sNum.substring(0, end);
				else{
					arrays[i] = sNum.substring(start, end);
				}
				end = start;
				start = end-3;				
			}
			String str[] = new String[n];
			for (int i = 0; i < str.length; i++) {
				str[i] = readHunred(arrays[i]);
			}
			System.out.println(conbine(str));
			
		}
	}
	static String readHunred(String num){
		String gewei[]= {"zero","one","two","three","four","five","six","seven","eight","nine","ten"
				         , "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen"
				         ,"nineteen"};
		String shiwei[] = {"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		StringBuffer sb = new StringBuffer();
		if(num.length()==3){
			char baiWei = num.charAt(0);
			if(baiWei!='0'){
				sb.append(gewei[Integer.parseInt(String.valueOf(baiWei))]);
				sb.append(" ");
				sb.append("hundred");
			}
			char shiWei = num.charAt(1);
			if(shiWei!='0'){
				if(baiWei!='0')
					sb.append(" ").append("and").append(" ");
				if(shiWei=='1'){
					sb.append(gewei[Integer.parseInt(num.substring(1))]);
				}else{
					sb.append(shiwei[Integer.parseInt(String.valueOf(shiWei))]);	
					char geWei = num.charAt(2);
					if(geWei!='0'){
						sb.append(" ");
						sb.append(gewei[Integer.parseInt(String.valueOf(geWei))]);
					}
				}
			}else{				
				char geWei = num.charAt(2);
				if(geWei!='0'){
					if(baiWei!='0')
						sb.append(" ").append("and").append(" ");
					sb.append(gewei[Integer.parseInt(String.valueOf(geWei))]);
				}
			}
			
		}else if(num.length()==2){
			char shiWei = num.charAt(0);
			if(shiWei!='0'){
				if(shiWei=='1'){
					sb.append(gewei[Integer.parseInt(num.substring(0))]);
				}else{
					sb.append(shiwei[Integer.parseInt(String.valueOf(shiWei))]);	
					char geWei = num.charAt(1);
					if(geWei!='0'){
						sb.append(" ");
						sb.append(gewei[Integer.parseInt(String.valueOf(geWei))]);
					}
				}
			}else{
				char geWei = num.charAt(1);
				if(geWei!='0'){
					sb.append(gewei[Integer.parseInt(String.valueOf(geWei))]);
				}
			}
		}else if(num.length()==1){
			char geWei = num.charAt(0);
			if(geWei!='0')
			sb.append(gewei[Integer.parseInt(String.valueOf(geWei))]);
		}
		
		return sb.toString();
		
	}
	static String conbine(String [] str){
		int len = str.length;
		String []liang = {"","thousand","million"};
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			int tmp = len-1-i;
			if(sb.length()==0){
				sb.insert(0, liang[i]);
				if(sb.length()!=0)
				sb.insert(0, " ");
				sb.insert(0, str[tmp]);
			}else{
				sb.insert(0, " ");
				sb.insert(0, liang[i]);
				sb.insert(0, " ");
				sb.insert(0, str[tmp]);
			}
		}
		return sb.toString();
	}
}
