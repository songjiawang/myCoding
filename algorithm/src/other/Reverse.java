package other;

public class Reverse {
	private static void reverse(char[]chs,int start,int end){
		if(chs==null || chs.length<=1)return;
		while(start<end){
			char tmp = chs[start];
			chs[start] = chs[end];
			chs[end] = tmp;
			start++;
			end--;
		}
		
	}
	
	private static String reverseOneSentence(String str){
		if(str==null || str.length()<=1)return str;
		char[] chs = str.toCharArray();
		int len = str.length();
		
		reverse(chs,0,len-1);
	
		int start = 0;
		int end = 0;
		while(start<len && end<len){
			
			while(start<len && chs[start]==' ')start++;
			if(start>=len)break;
			end = start;
			while(end<len && chs[end]!=' ')end++;
			end = end-1;
			reverse(chs, start, end);
			start = end+1;
		}
		return new String(chs);
		
	}
	public static void main(String[] args) {
		System.out.println(reverseOneSentence("i am a student!  "));
	}
}
