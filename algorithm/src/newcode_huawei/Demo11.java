package newcode_huawei;

import java.util.Scanner;

/**
 * ����һ��������������������ַ�������ʽ�������
 * ���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
 * @author purple
 *
 */
public class Demo11 {
	 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
