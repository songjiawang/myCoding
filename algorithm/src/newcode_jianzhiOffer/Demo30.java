package newcode_jianzhiOffer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * ��һ���ַ���(1<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��
 * @author purple
 *
 */
public class Demo30 {
	public int FirstNotRepeatingChar(String str) {
        List<Character> list1 = new LinkedList<Character>();
        List<Character> list2 = new LinkedList<Character>();
        char[] c = str.toCharArray();
        for(char ch:c){
        	if(list1.contains(ch)){
        		list1.add(ch);
        		if(list2.contains(ch))
        			list2.remove(list2.indexOf(ch));
        	}else{
        		list1.add(ch);
        		list2.add(ch);
        	}
        }
        if(list2.isEmpty())return -1;
        String s = new StringBuffer().append(list2.get(0)).toString();
        return str.indexOf(new String(s));
		
    }
	 public static void main(String[] args) {
			
			Demo30 d= new Demo30(); 
            System.out.println(d.FirstNotRepeatingChar("google"));
			
		}
}
