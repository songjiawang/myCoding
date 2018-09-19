package newcode_jianzhiOffer;
/**请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次
 * （包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 * @author purple
 *
 */
public class Demo59 {
	 public static boolean match(char[] str, char[] pattern){   
		 if(str.length==0 && pattern.length==0)return true;
		 if(str.length!=0 && pattern.length==0)return false;
		 int i=0,j=0;
		 return matchs(str,i,pattern,j);
	 }
	 public static boolean matchs(char[] str, int i,char[] pattern ,int j){ 
		 if(i>=str.length && j>=pattern.length)return true;
		 if(i<str.length && j>=pattern.length)return false;;
		 
		 if(j+1<pattern.length){			 
			 if(pattern[j+1]!='*'){
				 if(i<str.length){
					 if(str[i]==pattern[j] || pattern[j]=='.')
						 return matchs(str,i+1,pattern,j+1);
					 else return false;
				 }else{
					 return false;
				 }				 
			 }else{
				 if(i<str.length){
					 if(str[i]==pattern[j] || pattern[j]=='.'){
						 return matchs(str,i+1,pattern,j) || matchs(str,i+1,pattern,j+2) || matchs(str,i,pattern,j+2);													 
					 }else{
						 return matchs(str,i,pattern,j+2);
					 }			 
				 }else{
					 return matchs(str,i,pattern,j+2);
				 }
			 }
		 }else {
			 if(i<str.length){
				 if(str[i]==pattern[j] || pattern[j]=='.')
					 return matchs(str,i+1,pattern,j+1);
				 else return false;
			 }else{
				 return false;
			 }
			 
		 }
		 
	 }
	 public static void main(String[] args) {
		 char []str = {'a'}, m = {'.','*'};
		 System.out.println(match(str,m));
	}
}
