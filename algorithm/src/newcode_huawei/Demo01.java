package newcode_huawei;

import java.util.Scanner;

/**
 * �����ַ������һ�����ʵĳ��ȣ������Կո������ 
 * @author purple
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String instr=null;
		if(sc.hasNext()){
			instr=sc.nextLine();
		}
		String[] str = instr.split(" ");
		String res = str[str.length-1];
		System.out.println(res.length());
		
		
		
		
	}
}
