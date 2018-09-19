package newcode_huawei;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，
 * 则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序
 * @author purple
 *
 */
public class Demo23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			char[] ch = sc.nextLine().toCharArray();
			LinkedHashMap<Character, Integer> map = new LinkedHashMap();
			StringBuffer sb = new StringBuffer();
			int min = ch.length;
			LinkedList<Character> list  = new LinkedList<Character>();
			for (char key : ch) {
				list.add(key);
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + 1);
				} else {
					map.put(key, 1);
				}
			}
			for (char key : map.keySet()) {
				min = map.get(key) < min ? map.get(key) : min;
			}
			for (char key : map.keySet()) {
				if (map.get(key) == min) {
					for (int i = 0; i < min; i++) {
						list.remove(list.indexOf(key));
					}					
					}
				}			
			for (char c:list) {
				sb.append(c);
			}
			System.out.println(sb.toString());
		}

	}
}
