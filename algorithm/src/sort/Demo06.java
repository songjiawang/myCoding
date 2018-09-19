package sort;
/**
 * 快速排序(交换排序)(nlogn)
 * @author purple
 *
 */
public class Demo06 {
	public static void fastSort(int []array,int start,int end){
		int pivot;
		if(start<end){
			pivot =partition(array,start,end);
			fastSort(array,start,pivot-1);
			fastSort(array,pivot+1,end);
		}
		
	}
	//对i 和j 之间的序列做划分 返回枢轴的位置
	//本可能用比较->插入的方法将小于基准的元素放入左边，大于基准的元素放入右边，但这需要大量的比较和移动数据
	public static int partition(int [] array, int i, int j){
		int pivot = array[i];//使用第一个元素作为基准
		while(i<j){
			while(array[j]>pivot && i<j) j--;//从右向左，找到第一个小于pivot的元素
			if(i<j){
				int tmp = array[j];
				array[j]=array[i];
				array[i]=tmp;
				i++;
			}
			while(array[i]<pivot && i<j)i++;//从左向右找到第一个大于pivot的元素
			if(i<j){
				int tmp = array[i];
				array[i]=array[j];
				array[j]=tmp;
				j--;
			}
		}
		return i;		
	}

	 public static void main(String[] args) {
 		int[]array = {5,1,6,7,4,3,2,7,4};
 		fastSort(array,0,array.length-1);
 		for(int i:array){
 			System.out.print(i+"");
 		}
 	}
}
