package sort;
/**
 * ¿ìËÙÅÅĞò
 * @author purple
 *
 */
public class Demo06_1 {
	public static void fastSort(int[]array,int start,int end){
		int pos;
		if(start<end){
			pos = partion(array,start,end);
			fastSort(array,start,pos-1);
			fastSort(array,pos+1,end);
		}
	}
	public static int partion(int []array,int start,int end){
		int i=start;
		int j=end;
		int flag = array[start];
		
		while(i<j){
			
			while(i<j && array[j]>array[i]) j--;
			if(i<j){
				int tmp = flag;
				array[i]=array[j];
				array[j]=tmp;
				i++;
			}
			
			while(i<j && array[i]<array[j])i++;
			if(i<j){
				int tmp = flag;
				array[j]=array[i];
				array[i]=tmp;
				j--;
			}
		}
		return i;
	}
	 public static void main(String[] args) {
 		int[]array = {1,2,4,2,9,4,7};
 		fastSort(array,0,array.length-1);
 		for(int i:array){
 			System.out.print(i+"");
 		}
 	}
}
