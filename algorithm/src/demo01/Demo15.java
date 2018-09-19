package demo01;
/**
 * 添加回文串
 * 对于一个字符串，我们想通过添加字符的方式使得新的字符串整体变成回文串，但是只能在原串的结尾添加字符，请返回在结尾添加的最短字符串。

给定原字符串A及它的长度n，请返回添加的字符串。保证原串不是回文串。
 * @author purple
 *
 */
public class Demo15 {
	public static void main(String[] args) {
		addToPalindrome("abab",1);
	}
	public static String addToPalindrome(String A, int n) {
        // write code here
		char [] ch = A.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==ch[ch.length-1]
			  && isHuiWen(new String(ch,i,ch.length-1-i+1))){
				StringBuffer sb = new StringBuffer(new String(ch,0,i));
				sb.reverse();
				return sb.toString()+","+i;			
			}
		}
		return A;
		
    }
	public static boolean isHuiWen(String str){
		for (int i = 0; i < (str.length()/2)+1; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
}
