package newcode_huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * @author purple
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			double numd = Double.parseDouble(str);
			int numi = (int)numd/1;
			double co = numd-numi;
			if(co>=0.5){
				System.out.println(numi+1);
			}else{
				System.out.println(numi);
			}
		}
	}
}
