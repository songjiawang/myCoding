package newcode_ChengXuYuanMIanShiJInDian;
/**
 * »ù±¾×Ö·û´®Ñ¹Ëõ
 * @author purple
 *
 */
public class Demo05 {
	public String zipString(String iniString) {
        // write code here
		char [] ch = iniString.toCharArray();
		StringBuffer sb = new StringBuffer();
		if(iniString.length()==0)return "";
		char olderChar = ch[0];
		sb.append(ch[0]);
		int count = 1;
		for (int i = 1; i < ch.length; i++) {
			if(ch[i]==olderChar){
				count++;				
			}else{
				sb.append(count);
				count=1;
				sb.append(ch[i]);
				olderChar = ch[i];
			}
		}
		if(count!=1)sb.append(count);
		String resStr = sb.toString();
		return resStr.length()<ch.length?resStr:iniString;
    }
}
