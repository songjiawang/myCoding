package newcode_huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * �������ٳ��ж���λͬѧ��ʹ��ʣ�µ�ͬѧ�ųɺϳ�����

˵����

Nλͬѧվ��һ�ţ�������ʦҪ�����е�(N-K)λͬѧ���У�ʹ��ʣ�µ�Kλͬѧ�ųɺϳ����Ρ� 
�ϳ�������ָ������һ�ֶ��Σ���Kλͬѧ���������α��Ϊ1��2����K�����ǵ���߷ֱ�ΪT1��T2������TK��   �����ǵ�����������i��1<=i<=K��ʹ��T1<T2<......<Ti-1<Ti>Ti+1>......>TK�� 
��������ǣ���֪����Nλͬѧ����ߣ�����������Ҫ��λͬѧ���У�����ʹ��ʣ�µ�ͬѧ�ųɺϳ����Ρ� 
 * @author purple
 *
 */
public class Demo24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList();
		int maxIndex = 0;
		int i = 0;
		while(i<n){
			int tmp = sc.nextInt();
			list.add(tmp);
			maxIndex = tmp>list.get(maxIndex)?i:maxIndex;
			i++;
		}
		for (int j = 0; j < list.size(); j++) {
			
		}
	}
}
