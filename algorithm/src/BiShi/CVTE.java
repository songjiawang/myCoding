package BiShi;

public class CVTE {
	/**
	 * 最长回文子序列
	 * @param str
	 * @return
	 */
	public static String maxHuiwenXunLei(String str){
		char[]ch = str.toCharArray();
		String[]res = new String[1];
		res[0]="";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			count(sb,i,ch,res);
		}
		
		return res[0];
	}
	
	
	private static void count(StringBuffer sb, int i, char[] ch, String[]res) {
		// TODO Auto-generated method stub
		sb.append(ch[i]);
		if(isHuiWen(sb.toString())){
			if(sb.toString().length()>res[0].length()){
				res[0] = sb.toString();
			}
		}
		
		for (int j = i+1; j < ch.length; j++) {
			count(sb,j,ch,res);
		}
		
		
			sb.deleteCharAt(sb.length()-1);
		
	}


	public static boolean isHuiWen(String str){
		for (int i = 0; i < (str.length()/2)+1; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(maxHuiwenXunLei("412345565545434421"));
	}
}
