package newcode_huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * ��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
 * @author purple
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		List<Character> list = new LinkedList();
		int index = s.length()-1;
		while(index>=0){
			if(s.charAt(index)>=0 && s.charAt(index)<=127 && 
					!list.contains(s.charAt(index))){
				list.add(s.charAt(index));
			}
			index--;
		}		
		System.out.println(list.size());
		
	}
}
