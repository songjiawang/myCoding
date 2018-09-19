package newcode_huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * @author purple
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		char[] c= num.toCharArray();
		StringBuffer res = new StringBuffer();
		List<Character> list = new LinkedList();
		int index = c.length-1;
		while(index>=0){
			if(!list.contains(c[index])){
				list.add(c[index]);
			}
			index--;
		}
		if(list.isEmpty()){
			System.out.println(-1);
			return;
		}else{
			for(char ch:list){
				res.append(ch);
			}
			
		}
		System.out.println(Integer.parseInt(res.toString()));
	
		
		
	}
}
