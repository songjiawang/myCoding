package newcode_huawei;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ����n���ַ��������n���ַ��������ֵ������С�
��������:
�����һ��Ϊһ��������n(1��n��1000),����n��Ϊn���ַ���(�ַ������ȡ�100),�ַ�����ֻ���д�Сд��ĸ��
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
