package newcode_huawei;

import java.util.Scanner;

/**
 * ������һ�������⣺��ĳ�̵�涨����������ˮƿ���Ի�һƿ��ˮ��С��������ʮ������ˮƿ���������Ի�����ƿ��ˮ�ȣ���
 * ����5ƿ���������£�����9����ƿ�ӻ�3ƿ��ˮ���ȵ�3ƿ���ģ������Ժ�4����ƿ�ӣ�
 * ��3���ٻ�һƿ���ȵ���ƿ���ģ���ʱ��ʣ2����ƿ�ӡ�Ȼ�������ϰ��Ƚ����һƿ��ˮ���ȵ���ƿ���ģ�
 * �����Ժ���3����ƿ�ӻ�һƿ���Ļ����ϰ塣���С��������n������ˮƿ�������Ի�����ƿ��ˮ�ȣ� 
 * @author purple
 *
 */
public class Demo22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextLine()){
			int num = Integer.parseInt(sc.nextLine());
			if(num==0)break;
			System.out.println((num/2)==0?0:num/2);		
		}
		
		
	}
}
