package demo01;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * É¾³ı×Ö·û´®ÖĞÏàÍ¬×ÖÄ¸
 * @author purple
 *
 */
public class demo05 {
	
	public static String delete(String str){
		Set<Character> set = new TreeSet<Character>();
		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++){
			if(!set.contains(c[i])){
				set.add(c[i]);
			}else{
				set.remove(c[i]);
			}
		}
		Character[] c2 = set.toArray(new Character[0]);
		System.out.println(Arrays.toString(c2));
		return null;
	}
	public static void main(String[] args) {
		delete("aabccdfd");
	}
}
