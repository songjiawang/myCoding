package newcode_huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * НјЖ¬ХыАн
 * @author purple
 *
 */
public class Demo35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char ch[] = sc.nextLine().toCharArray();
			Arrays.sort(ch);
			System.out.println(new String(ch));
		}
	}
}
