package sort;

/**
 * ϣ������ֱ�Ӳ�������������棩 ˼�룺ֱ�Ӳ����������ĳ�������Ķ�������У��γɻ����������У�Ȼ��ֱ�����������
 * 
 * @author purple
 *
 */
public class Demo04 {
	public static void sort(int[] array) {
		for (int d = array.length / 2; d >= 1; d = d / 2) {
			for (int i = 0; i < d; i++) {

				for (int j = i + d; j < array.length; j = j + d) {
					int tmp = array[j];
					for (int k = j - d; k >= 0 && array[k] > array[k + d]; k = k - d) {
						array[k + d] = array[k];
						array[k] = tmp;
					}
				}

			}

		}
	}
	public static void main(String[] args) {
		int[]array = {1};
		sort(array);
		for(int i:array){
			System.out.print(i+"");
		}
	}
}
