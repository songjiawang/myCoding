package leetcode;
/**
 * ��Ĺ���ǰ׺
 * @author purple
 *
 */
public class Demo14 {
	public static String longestCommonPrefix(String[] strs) {
		//������̵��ַ�������
		if(strs==null){
			return null;
		}
		if(strs.length==0){
			return "";
		}
		int min=Integer.MAX_VALUE;;
		for(String s:strs){
			if(s.length()<min){
				min=s.length();
			}
		}
		boolean flag=true;
		int i=0;
			for (i = 0; i < min; i++) {		
				for (int j = 1; j < strs.length; j++) {
					if(strs[0].charAt(i)!=strs[j].charAt(i)){
						flag=false;
						break;	
					}
				}
			if(flag==false){
				break;
			}	
		 }
			
		return strs[0].substring(0, i);
		
    }
	public static void main(String[] args) {
		String[]strs = {""};
		System.out.println(longestCommonPrefix(strs));
	}
}
