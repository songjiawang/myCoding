package sort;
/**
 * 直接选择排序O(n^2):从无序区中选择最小的和无序区中的第一个交换，直到无序区为空
 * 性能优于冒泡
 * @author purple
 *
 */
public class Demo03 {
	public static void sort(int [] array){
		int min = 0;//最小元素的索引
		for (int i = 0; i < array.length-1; i++) {
			min=i;//无序区第一个元素默认为最小
			for (int j = i+1; j < array.length; j++) {
				if(array[j]<array[min]){
					min=j;               //比较最小的元素
				}
			}
			if(min!=i){
				int tmp = array[min];
				array[min]=array[i];
				array[i]=tmp;  //交换
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
