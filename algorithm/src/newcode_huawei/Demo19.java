package newcode_huawei;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * ����һ���򵥴����¼����Сģ�飬�ܹ���¼����Ĵ������ڵ��ļ����ƺ��кš�
���� 
1�� ��¼���8�������¼��ѭ����¼������ͬ�Ĵ����¼�����ļ����ƺ��к���ȫƥ�䣩ֻ��¼һ��������������ӣ�
2�� ����16���ַ����ļ����ƣ�ֻ��¼�ļ��������Ч16���ַ���
3�� ������ļ����ܴ�·������¼�ļ����Ʋ��ܴ�·����
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
            if(count>(map.keySet().size()-8)) //������˸���¼
                System.out.println(string+" "+map.get(string));
        }
		
		
	}
}
