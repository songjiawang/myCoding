package demo01;

import java.util.Scanner;

/**
 * �����ַ���
 * ����һ�����Ȳ�����1000���ַ������ж����ǲ��ǻ���(˳�����������ͬ)��
 * @author purple
 *
 */
public class Demo13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			if(isHuiWen(str)){
				System.out.println("YES");
			}else{
				System.out.println("No");
			}
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
