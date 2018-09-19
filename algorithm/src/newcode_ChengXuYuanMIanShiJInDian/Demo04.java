package newcode_ChengXuYuanMIanShiJInDian;
/**
 * ¿Õ¸ñÌæ»»
 * @author purple
 *
 */
public class Demo04 {
	public String replaceSpace(String iniString, int length) {
        // write code here
		char [] ch = iniString.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ')sb.append("%20");
			else{
				sb.append(ch[i]);
			}
		}
		return sb.toString();
    }
}
