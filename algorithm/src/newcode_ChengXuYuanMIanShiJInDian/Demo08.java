package newcode_ChengXuYuanMIanShiJInDian;
/**
 * ·­×ª×Ö·û´®
 * @author purple
 *
 */
public class Demo08 {
	public boolean checkReverseEqual(String s1, String s2) {
        // write code here
		if(s1.length()!=s2.length())return false;
		String s3= s1+s1;
		if(s3.contains(s2)){
			return true;
		}else{
			return false;
		}
		
    }
}
