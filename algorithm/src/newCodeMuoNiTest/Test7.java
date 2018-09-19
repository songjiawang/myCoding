package newCodeMuoNiTest;

import java.util.Scanner;

/**
 * ÆË¿ËÅÆ´óÐ¡
 * @author purple
 *
 */
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String [] str= sc.nextLine().split("-");
		
			System.out.println(compare(str[0],str[1]));
		}
	}

	public static String compare(String one, String two) {
		// TODO Auto-generated method stub
		if(one.equals("joker JOKER") || two.equals("joker JOKER")){
			return "joker JOKER";
		}
		if(one.length()==7 && two.length()!=7 ){
			return one;
		}
		if(two.length()==7 && one.length()!=7 ){
			return one;
		}
		
		if(one.length()>=9 && two.length()<9){
			return "ERROR";
		}
		if(one.length()==5 ||one.length()==3 || one.length()==9 || one.length()==1 || one.length()==7){
			if(one.charAt(one.length()-1)>two.charAt(two.length()-1)){
				return one;
			}else{
				return two;
			}
		}
		
		
		return "ERROR";
	}
}
