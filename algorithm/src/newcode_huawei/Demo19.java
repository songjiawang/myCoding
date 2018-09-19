package newcode_huawei;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
处理： 
1、 记录最多8条错误记录，循环记录，对相同的错误记录（净文件名称和行号完全匹配）只记录一条，错误计数增加；
2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
3、 输入的文件可能带路径，记录文件名称不能带路径。
 * @author purple
 *
 */
public class Demo19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String,Integer>map = new LinkedHashMap();
		while(sc.hasNextLine()){
			String[] str = sc.nextLine().split(" ");
			String fileName = str[0].split("\\\\")[str[0].split("\\\\").length-1];
			if(fileName.length()>16)fileName = fileName.substring(fileName.length()-16);
			String lineNo = str[1];
			String key = fileName+" "+lineNo;
			if(map.containsKey(key)){
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}	
			
		}
		int count = 0;

        for(String string:map.keySet()){
            count++;
            if(count>(map.keySet().size()-8)) //输出最后八个记录
                System.out.println(string+" "+map.get(string));
        }
		
		
	}
}
