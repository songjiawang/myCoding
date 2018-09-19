package newcode_jianzhiOffer;
/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Demo02 {
	public static String replaceSpace(StringBuffer str) {
    	if(str.length()==0)return str.toString();
    	for (int i = 0; i < str.length();) {
			if(str.charAt(i)==' '){
				//str.deleteCharAt(i);
				str.replace(i, i+1, "%20");
				i=i+3;
			}else{
				i++;
			}
		}
    	
		return str.toString();
    }
	
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(" ni  hao ");
		System.out.println(replaceSpace(str));
	}
}
