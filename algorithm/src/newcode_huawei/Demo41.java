package newcode_huawei;

import java.util.Scanner;

/**
 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո�
 * @author purple
 *
 */
public class Demo41 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(sc.hasNextLine()){
		char[]ch = sc.nextLine().toCharArray();
		int numOfLetter = 0;
		int numOfNum = 0;
		int numOfSpace = 0;
		int numOfOther = 0;
		for(char c:ch){
			if(Character.isLetter(c))numOfLetter++;
			else if(c==' ')numOfSpace++;
			else if(String.valueOf(c).matches("[0-9]"))numOfNum++;
			else numOfOther++;
		}
		System.out.println(numOfLetter);
		System.out.println(numOfSpace);
		System.out.println(numOfNum);
		System.out.println(numOfOther);
	}					
	}
}
