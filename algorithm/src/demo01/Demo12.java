package demo01;

import java.util.Scanner;

/**
 * ͳ�ƻ���
 * ���ַ���B�����ַ���Aʹ�������ַ�����һ�����Ĵ�������ܻ��������󣬰�����Ѱ���ж����ֲ���취����ʹ�´���һ�����Ĵ���
 * ����ַ���B�����λ�ò�ͬ�Ϳ���Ϊ��һ���İ취��
 * @author purple
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextLine()){
			String strA = sc.nextLine();
			String strB = sc.nextLine();
			int n = 0;
			for (int i = 0; i <= strA.length(); i++) {
				StringBuffer sb = new StringBuffer(strA);
				sb.insert(0, strB);
				if(isHuiWen(sb.toString())){
					n++;
				}				
			}
			
			System.out.println(n);
		}
	}
	public static boolean isHuiWen(String str){
		for (int i = 0; i < (str.length()/2)+1; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				return false;
			}
		}
		return true;
	}
		
		
}
