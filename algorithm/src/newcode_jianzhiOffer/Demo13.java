package newcode_jianzhiOffer;

import java.util.Arrays;

/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
 * ���е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 */
public class Demo13 {
	public static void reOrderArray(int [] array) {
		if(array.length==0) return;
		int jIndex=-1;
        for (int i = 0; i < array.length; i++) {
        	int temp=array[i];
        	if(array[i]%2!=0){				
				for (int j = i-1; j>jIndex; j--) {
					array[j+1]=array[j];
				}
				array[jIndex+1]=temp;
				System.out.println(Arrays.toString(array));
				jIndex++;
			}
		}
    }
	
	public static void main(String[] args) {
		int []n={1,2,3,4,5,6,7};
		reOrderArray(n);
		//System.err.println(Arrays.toString(n));
	}
}
