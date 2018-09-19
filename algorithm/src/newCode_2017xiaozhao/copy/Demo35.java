package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * n个数里出现次数大于等于n/2的数
 * @author CQIT
 *
 */
public class Demo35 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextLine()){
			String[]strs = sc.nextLine().split(" ");
			Arrays.sort(strs);
			int c=1;
			int len = strs.length;
			for (int i = 1; i < len; i++) {
				if(strs[i].equals(strs[i-1])){
					c++;
					if(c>=len/2){
						System.out.println(strs[i]);
						break;
					}
				}else{
					c=1;
				}
			}
			
		}

	}
}
