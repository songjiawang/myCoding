package sort;

/**
 * 希尔排序（直接插入排序的升级版） 思想：直接插入排序距离某个增量的多个子序列，形成基本有序序列，然后直接排序该序列
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
