package newcode_huawei;

import java.util.Scanner;

/**
 * 统计每个月兔子总数
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

