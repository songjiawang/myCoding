package newcode_huawei;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ʵ��ɾ���ַ����г��ִ������ٵ��ַ���������ַ����ִ���һ����
 * ��ɾ�������ɾ����Щ���ʺ���ַ������ַ����������ַ�����ԭ����˳��
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
