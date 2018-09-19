package newcode_ChengXuYuanMIanShiJInDian;

import java.util.Arrays;

/**
 * È·ÈÏ×Ö·û»¥Òì
 * @author purple
 *
 */
public class Demo01 {
	public boolean checkDifferent(String iniString) {
        char []ch = iniString.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]==ch[i+1])return false;
		}
        return true;
    }
}
