package sort;
/**
 * ֱ��ѡ������O(n^2):����������ѡ����С�ĺ��������еĵ�һ��������ֱ��������Ϊ��
 * ��������ð��
 * @author purple
 *
 */
public class Demo03 {
	public static void sort(int [] array){
		int min = 0;//��СԪ�ص�����
		for (int i = 0; i < array.length-1; i++) {
			min=i;//��������һ��Ԫ��Ĭ��Ϊ��С
			for (int j = i+1; j < array.length; j++) {
				if(array[j]<array[min]){
					min=j;               //�Ƚ���С��Ԫ��
				}
			}
			if(min!=i){
				int tmp = array[min];
				array[min]=array[i];
				array[i]=tmp;  //����
			}
		}
	}
	public static void main(String[] args) {
		int[]array = {1,1};
		sort(array);
		for(int i:array){
			System.out.print(i+"");
		}
	}
}
