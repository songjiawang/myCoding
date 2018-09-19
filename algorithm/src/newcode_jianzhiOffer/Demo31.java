package newcode_jianzhiOffer;

import java.util.LinkedList;
import java.util.List;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * @author purple
 *
 */
public class Demo31 {
	public String PrintMinNumber(int [] numbers) {
		if(numbers.length==0)return "";
		int end = 0;
		for (int i = 1; i < numbers.length; i++) {
			int tmp = numbers[i];
			for (int j = i-1; j >=0  && Long.parseLong(numbers[j+1]+""+numbers[j])<Long.parseLong(numbers[j]+""+numbers[j+1]); j--) {
				numbers[j+1]=numbers[j];
				numbers[j]=tmp;
			}
		}		
		StringBuffer res = new StringBuffer();
		for(int i:numbers){
			res.append(i);
		}
		
		return res.toString();
    }
	
}
