package newcode_ChengXuYuanMIanShiJInDian;

import java.util.Arrays;

/**
 * 确定两串乱序同构
 * @author purple
 *
 */
public class Demo03 {
	public boolean checkSam(String stringA, String stringB) {
        // write code here
		if(stringA.length()!=stringB.length())return false;
		else{
		char[] chA = stringA.toCharArray();
		char[] chB = stringB.toCharArray();
		Arrays.sort(chA);
		Arrays.sort(chB);
		return (new String(chA)).equals(new String(chB));}
    }
}
