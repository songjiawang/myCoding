package demo01;

import java.util.Scanner;

/**
 * ����������
 * ��ȡһ����������������ǻ������������������ĵ�������ӣ�
 * ����Ͳ��ǻ����������ظ��������裬һֱ����û�����Ϊֹ�����磺68���154��68+86����
 * �ٱ��605��154+451���������1111��605+506������1111�ǻ�������
 * ��������ѧ�����һ�����룺���ۿ�ʼ��ʲô���������ھ������޴��������͵�������ӵĲ����
 * ����õ�һ��������������Ϊֹ����֪����������ǶԻ��Ǵ���������������֤֮��
 * @author purple
 *
 */
public class Demo17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();

			int count = 0;
			String process = str;
			int tmp = Integer.parseInt(str);
			int add = 0;
			while(!isHuiWen(str)){
				StringBuffer sb = new StringBuffer(str);
				sb.reverse();
				int reTmp = Integer.parseInt(sb.toString());
				add = tmp+reTmp;
				tmp = add;
				str = String.valueOf(add);
				process = process+"--->"+str;
				count++;
			}
			System.out.println(process);
			System.out.println(count);
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
