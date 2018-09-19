package newcode_huawei;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ≤È’“–÷µ‹µ•¥ 
 * @author purple
 *
 */
public class Demo27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int numOfWord = sc.nextInt();
			LinkedList<String> list = new LinkedList();
			while(numOfWord-->0){
				list.add(sc.next());
			}
			String desWord = sc.next();
			int index = sc.nextInt();
			Collections.sort(list);
			int count = 0;
			String res = null;
			for(String str:list){
				if(isBrother(str, desWord)){
					count++;
					if(count==index){
						res = str;
					}
				}
			}
			System.out.println(count);
            if(res!=null)
            System.out.println(res);
		}
	}
	static boolean isBrother(String srcString,String desString){
		if(srcString.length()!=desString.length() || srcString.equals(desString))return false;
		char[]s = srcString.toCharArray();
		char[]d = desString.toCharArray();
		Arrays.sort(s);
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			if(s[i]!=d[i])return false;
		}
		
		return true;
	}
}
