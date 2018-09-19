package demo01;

/**
 * 消除字符串头尾的的空格合中间多余的空格（中间字符之间只有一个空格）" 123  34 45 6 "->"123 34 45 6"
 * @author purple
 *
 */
public class Demo06 {
	public static String removeBlackSpace(String s){
		char[] c = s.toCharArray();
		StringBuilder str = new StringBuilder();
		int start=0;
		int end=0;
		int index=0;
		if(s=="")return "";
		for (int i = 0; i < c.length; i++) {
				if(c[i]!=' '){
					start=i;
					break;
				}
		}
		for (int i = c.length-1; i>=0; i--) {
			if(c[i]!=' '){
				end=i;
				break;
			}
		}
		
		for (int i = start; i<=end; i++) {
			if(c[i]!=' '){
				str.append(c[i]);
				index++;
			}else if(c[i]==' ' &&c[i-1]!=' '){
				str.append(c[i]);
				index++;		
			}
		}
			
		return str.toString();
	}
	public static void main(String[] args) {
		String str="adf fda sdfd    df d asdddd    ";
		System.out.println(removeBlackSpace(str));
	}
}
