package newcode_huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/*
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 */
public class Demo08 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap();
		int num = Integer.parseInt(sc.nextLine());

		while (num > 0) {
			String str = sc.nextLine();
			String[] s = str.split(" ");
			String key=s[0];
			int val = Integer.parseInt(s[1]);
			if (map.containsKey(key)) {
				map.put(key, map.get(key)+val);

			} else {
				map.put(key, val);
			}
			num--;
		}

		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}*/
		Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Map<String, Integer> map = new TreeMap<String, Integer>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String s=sc.next();
                int value=Integer.parseInt(sc.next());
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + value);
                } else
                    map.put(s, value);
            }
            for (String key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
        }
		
		
	}

}
