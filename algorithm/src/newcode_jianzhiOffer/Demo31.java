package newcode_jianzhiOffer;

import java.util.LinkedList;
import java.util.List;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * @author purple
 *
 */
public class Demo31 {
	public String PrintMinNumber(int [] numbers) {
		if(numbers.length==0)return "";
		int end = 0;
		for (int i = 1; i < numbers.length; i++) {
			int tmp = numbers[i];
			for (int j = i-1; j >=0  && Long.parseLong(numbers[j+1]+""+numbers[j])<Long.parseLong(numbers[j]+""+numbers[j+1]); j--) {
				numbers[j+1]=numbers[j];
				numbers[j]=tmp;
			}
		}		
		StringBuffer res = new StringBuffer();
		for(int i:numbers){
			res.append(i);
		}
		
		return res.toString();
    }
	
}
