package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 找最长的无重复字母的子字符串长度
 * @author purple
 *
 */
//Given "abcabcbb", the answer is "abc", which the length is 3.
//Given "bbbbb", the answer is "b", with the length of 1.
//Given "pwwkew", the answer is "wke", with the length of 3. 
//Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class Demo03 {
	public static int lengthOfLongestSubstring(String s) {
	       int i=0,j=0;
	       char[] str = s.toCharArray();
	       int max=0;
	       Set<Character> set = new HashSet<Character>();
	       while(i<s.length()){
	    	   if(!set.contains(str[i])){
	    		   set.add(str[i]);
	    		   max = Math.max(max, set.size());
	    		   i++;
	    	   }else{
	    		   set.remove(str[j]);
	    		   j++;
	    	   }
	       }
		
		return max;
	    }
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcdebcabfgea"));
		String a = "abcde";

		
	}
}
