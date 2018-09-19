package newcode_ChengXuYuanMIanShiJInDian;
/**
 * Ô­´®·­×ª
 * @author purple
 *
 */
public class Demo02 {
	public static String reverseString(String iniString) {
		char [] ch = iniString.toCharArray();
		for (int i = 0; i <=(0+ch.length-1)/2; i++) {
			char tmp = ch[i];			
			ch[i]= ch[ch.length-1-i];
			ch[ch.length-1-i] = tmp;
		}
		return new String(ch);
    }
	public static void main(String[] args) {
		System.out.println(reverseString("This is nowcoder"));
	}
}
