package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给一串罗马数字，返回int数  1-3999
 * @author purple
 *
 */
public class Demo13 {
	 public int romanToInt(String s) {
		 Map<Character,Integer>map =new HashMap<Character,Integer>(); 
		 map.put('I', 1);
		 map.put('V', 5);
		 map.put('X', 10);
		 map.put('L', 50);
		 map.put('C', 100);
		 map.put('D', 500);
		 map.put('M', 1000);
		 char[]c = s.toCharArray();
		 int sum=map.get(c[0]);

		 for (int i = 1; i < c.length; i++) {
			if(map.get(c[i])<=map.get(c[i-1])){
				sum=sum+map.get(c[i]);
			}else{
				sum=sum+map.get(c[i])-2*map.get(c[i-1]);
			}
		}
 
		 return sum;
	    }
	public static void main(String[] args) {
		System.out.println('\uff1b');
	}
}
