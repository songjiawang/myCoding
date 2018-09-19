package sort;
/**
 * 冒泡排序O(n^2)(交换排序)
 * @author purple
 *
 */
public class Demo02 {
	public static void sort(int [] array){
		for (int i = 0; i < array.length-1; i++) {
			for (int j = array.length-1; j > i; j--) {
				if(array[j]<array[j-1]){
					int tmp = array[j];
					array[j]=array[j-1];
					array[j-1]=tmp;
				}
			}
		}
	}
	
	public static void sort_1(int [] array){
		boolean flag = true;//标志位，如过有一趟冒泡没有发生任何交换，则不用继续接下来的冒泡
		for (int i = 0; i < array.length-1 && flag; i++) {
			flag = false;
			for (int j = array.length-1; j > i; j--) {
				if(array[j]<array[j-1]){
					int tmp = array[j];
					array[j]=array[j-1];
					array[j-1]=tmp;
					flag=true;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]array = {7,6,5,4,4,5,3,1,9};
		sort_1(array);
		for(int i:array){
			System.out.print(i+"");
		}
	}
}
