package sort;
/**
 * 归并排序(二路归并)
 * @author purple
 *
 */
public class Demo05 {
     public static void sort(int [] array){
    	 for (int i = 1; i < array.length; i=i*2) {
    		 sort_1( array, i);
		}
    
     }
     //合并两个序列
     public static void sortTwoArray(int [] array , int start ,int mid, int end){
    	 int [] tmp = new int[end-start+1];
    	 int index1 = start;
    	 int index2 = mid+1;
    	 int i=0;
    	 while(index1<=mid && index2<=end){
    		 tmp[i++] = (array[index1]<array[index2])?array[index1++]:array[index2++];
//    		 if(array[index1]<array[index2]){
//    			 tmp[i]=array[index1];
//    			 index1++;
//    		 }else{
//    			 tmp[i]=array[index2];
//    			 index2++;
//    		 }
//    	 i++;
    	 }
    	 for(;index1<=mid;index1++,i++)tmp[i]=array[index1];
    	 for(;index2<=end;index2++,i++)tmp[i]=array[index2];
    	 
    	 for(int k=start,j=0;k<=end;k++,j++){
    		 array[k]=tmp[j];
    	 }    	    
     }
     //将长度为n 的子序列合并为长度为2n的序列
     public static void sort_1(int array[],int n){
    	 int i=0;
    	 for( i=0 ;i+2*n-1<array.length;i=i+2*n){
    		 sortTwoArray(array,i,i+n-1,i+2*n-1);
    	 }
    	 if(i+n-1<array.length){
    		 sortTwoArray(array,i,i+n-1,array.length-1);
    	 }
   	 
     }
     public static void main(String[] args) {
    		int[]array = {1,2,4,2,9,4,7};
    		sort(array);
    		for(int i:array){
    			System.out.print(i+"");
    		}
    	}
}
