package newcode_jianzhiOffer;
/**��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ��������
 * ������0�Σ��� �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
 * ���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
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
