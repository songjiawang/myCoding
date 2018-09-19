package newcode_jianzhiOffer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 * �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
 * @author purple
 *
 */
public class Demo29 {
	//Insert one char from stringstream
	Set<Integer>set = new HashSet<Integer>();
	List<Character> list1 = new LinkedList<Character>();
	List<Character> list2 = new LinkedList<Character>();
    public void Insert(char ch)
    {
        if(list1.contains(ch)){
        	list1.add(ch);
        	if(list2.contains(ch))
        	list2.remove(list2.indexOf(ch));
        }else{
        	list1.add(ch);
        	list2.add(ch);     	
        }        
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	if(list2.isEmpty()){
    		return '#';
    	}else{
    		return list2.get(0);
    	}
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Demo29 d= new Demo29(); 
		while(sc.hasNext()){
			char str = sc.nextLine().toCharArray()[0];
			d.Insert(str);
			System.out.println(d.FirstAppearingOnce());
		}
	}
}
