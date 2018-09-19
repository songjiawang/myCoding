package other;
/**
 * String ->int
 * @author CQIT
 *
 */
public class StringToInt {
	
	public static int parse(String str){
		if(str==null)throw new RuntimeException("null pointe exception");
		if(str.length()==0) throw new RuntimeException("string len exception");
		char[]chs = str.toCharArray();
		int index = 0;
		boolean isPostive = true;
		int limt = Integer.MAX_VALUE;
		boolean hasChar = false;
		if(chs[index]=='-'){
			index++;
			isPostive = false;
			hasChar = true;
			limt = Integer.MIN_VALUE;
		}else if(chs[index]=='+'){
			index++;
			isPostive = true;
			hasChar = true;
			limt = -Integer.MAX_VALUE;
		}
		if(hasChar && chs.length==1){
			throw  new RuntimeException("string not a integer exception");
		}
		int res = 0;
		while(index<chs.length){
			if(chs[index]>='0' && chs[index]<='9'){
				res = res*10 +(chs[index]-'0');
				
			}else{
				throw  new RuntimeException("string not a integer exception");
			}
			index++;
		}
		
		return isPostive?res:-res;
	}
	public static void main(String[] args) {
		System.out.println(parse("+123"));
	}
}
