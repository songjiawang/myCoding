package newcode_huawei;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 给定n个字符串，请对n个字符串按照字典序排列。
输入描述:
输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * @author purple
 *
 */
public class Demo14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		LinkedList<String>list = new LinkedList();
		while(n-->0){
			list.add(sc.nextLine());
		}
		Collections.sort(list);
		for(String s:list){
			System.out.println(s);
		}
	}
}
