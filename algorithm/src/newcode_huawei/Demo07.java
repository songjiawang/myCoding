package newcode_huawei;

import java.util.Scanner;

/**
 * д��һ�����򣬽���һ����������ֵ���������ֵ�Ľ�������ֵ�����С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ����
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
