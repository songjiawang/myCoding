package demo01;
/**
 * ��ӻ��Ĵ�
 * ����һ���ַ�����������ͨ������ַ��ķ�ʽʹ���µ��ַ��������ɻ��Ĵ�������ֻ����ԭ���Ľ�β����ַ����뷵���ڽ�β��ӵ�����ַ�����

����ԭ�ַ���A�����ĳ���n���뷵����ӵ��ַ�������֤ԭ�����ǻ��Ĵ���
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
