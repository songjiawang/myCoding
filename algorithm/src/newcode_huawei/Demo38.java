package newcode_huawei;

import java.util.Scanner;

/**
 * ͳ��ÿ������������
 * @author purple
 *
 */
public class Demo38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int mouth = sc.nextInt();		
			System.out.println(fNum(mouth));
	
		}
	}
	static int fNum(int n){
		if(n<=2)return 1;
		else{
			return fNum(n-1)+fNum(n-2);
		}
	}
}

