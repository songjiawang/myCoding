package newcode_huawei;

import java.util.Scanner;

/**
 * д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����������ͬʱ���� ��
 * 
 * @author purple
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String in = sc.nextLine();
			int j = in.length() - 1;
			int i = 0;
			int sum = 0;
			while (in.charAt(j) != 'x') {
				char c = in.charAt(j);
				
				if (c >= '0' && c <= '9') {
					sum = (int) (sum + Math.pow(16, i) * (c - '0'));
				} else {
					sum = (int) (sum + Math.pow(16, i) * (c - ('A' - 10)));
				}
				i++;
				j--;
			}

			
			System.out.println(sum);
			//System.out.println(Integer.parseInt(in.substring(2), 16));//ֱ��ʹ��java�Դ��ĺ������
		}
	}
}
