package newcode_huawei;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 
 * @author purple
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
		String strin = in.nextLine();
	
		LinkedList<String> list = new LinkedList<String>();
		int j=0;
		for (; j+8<=strin.length(); j=j+8) {
			list.add(strin.substring(j, j+8));
		}
		if(j!=strin.length()){
		StringBuffer s = new StringBuffer();
		s.append(strin.substring(j,strin.length()));
		int count=8-strin.length()+j;
		while(count>0){
			s.append("0");
			count--;
		}
		list.add(s.toString());}
		for (String s1 : list) {
			System.out.println(s1);
		}

	}
	}
}
