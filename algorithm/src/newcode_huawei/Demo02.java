package newcode_huawei;

import java.util.Scanner;

/**
 * д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
 * @author purple
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr = in.nextLine();
		String inChar = in.nextLine();
		char[]inStrChar = inStr.toCharArray();
		char inchar = inChar.charAt(0);
		int count=0;
		for(char c: inStrChar){
			if(c==inchar||c==inchar+32 || c==inchar-32)count++;
		}
		System.out.println(count);
		
	}
}
