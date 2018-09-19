package sort;
/**
 * 直接插入排序(从小到大)O(n^2)
 * 从第二个元素开始，将每个元素插入到前面已经排好序的序列中，直至最后
 * @author purple
 *
 */
public class Demo01 {
   public static void sort(int [] array){
	   int end=0;//初始的有序序列 从 0-end
	   for (int i = 1; i < array.length; i++,end++) {
		   int tmp = array[i];
		   for (int j = 0; j <=end; j++) {
			   if(tmp<array[j]){//比较
				   for (int k = end; k >=j; k--) {
					   array[k+1]=array[k];//序列后移
				   }
				   	array[j]=tmp;//插入	
				   	break;//若存在一个小于tmp，插入，不同比较后面的师傅小于tmp 因为后面的肯定小于tmp
			}
		}
	}
   }
   
   public static void sort_1(int [] array){
	   for (int i = 1; i < array.length; i++) {
		   int tmp = array[i];
			   for (int j = i-1; j >=0 && array[j+1]<array[j]; j--) {
				array[j+1]=array[j];
				array[j]=tmp;				
			}
		   
	   }
   }
   
   public static void main(String[] args) {
	int[]array = {1,2,4,2,9,4,7};
	sort_1(array);
	for(int i:array){
		System.out.print(i+"");
	}
}
}
