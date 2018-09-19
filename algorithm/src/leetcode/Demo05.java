package leetcode;
/*
 * 求字符串中最长的具有回文结构的子字符()  abcbad——>abcba   bbvaa-> bb  aa  
 * 
 */

//正确但是超时
public class Demo05 {
	 public static  String longestPalindrome(String s) {
		 String maxString=null;
		 int max=1;
		 for (int i = 0; i < s.length(); i++) {
			 if(s.length()-i<max){
				 break;
			 }
			for (int j = i+max-1; j < s.length(); j++) {		
				String temp = s.substring(i,j+1);
				if(temp.length()>max){
					if(isPalindrome(temp)){
						if(temp.length()>=max){
							max=temp.length();
							maxString=temp;
						}
					}
				}
			}
		}
		 
		 return maxString;
	 }
	public static  boolean isPalindrome(String s){
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		System.err.println(longestPalindrome("lcnvoknqgejxbfhijmxglisfzjwbtvhodwummdqeggzfczmetrdnoetmcydwddmtubcqmdjwnpzdqcdhplxtezctvgnpobnnscrmeqkwgiedhzsvskrxwfyklynkplbgefjbyhlgmkkfpwngdkvwmbdskvagkcfsidrdgwgmnqjtdbtltzwxaokrvbxqqqhljszmefsyewwggylpugmdmemvcnlugipqdjnriythsanfdxpvbatsnatmlusspqizgknabhnqayeuzflkuysqyhfxojhfponsndytvjpbzlbfzjhmwoxcbwvhnvnzwmkhjxvuszgtqhctbqsxnasnhrusodeqmzrlcsrafghbqjpyklaaqximcjmpsxpzbyxqvpexytrhwhmrkuybtvqhwxdqhsnbecpfiudaqpzsvfaywvkhargputojdxonvlprzwvrjlmvqmrlftzbytqdusgeupuofhgonqoyffhmartpcbgybshllnjaapaixdbbljvjomdrrgfeqhwffcknmcqbhvulwiwmsxntropqzefwboozphjectnudtvzzlcmeruszqxvjgikcpfclnrayokxsqxpicfkvaerljmxchwcmxhtbwitsexfqowsflgzzeynuzhtzdaixhjtnielbablmckqzcccalpuyahwowqpcskjencokprybrpmpdnswslpunohafvminfolekdleusuaeiatdqsoatputmymqvxjqpikumgmxaxidlrlfmrhpkzmnxjtvdnopcgsiedvtfkltvplfcfflmwyqffktsmpezbxlnjegdlrcubwqvhxdammpkwkycrqtegepyxtohspeasrdtinjhbesilsvffnzznltsspjwuogdyzvanalohmzrywdwqqcukjceothydlgtocukc"));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
}
