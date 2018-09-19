package newcode_jianzhiOffer;
/*
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，
 * 输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Demo06 {
	public int minNumberInRotateArray(int [] array) {
	    if(array.length==0)return 0;
	    for (int i = 1; i < array.length; i++) {
			if(array[i]<array[i-1])return array[i];
		}
	    
	    return 0;
    }
	
	public int minNumberInRotateArray2(int [] array) {
		if(array.length==0)return 0;
	    if(array.length==0)return 0;
	    int start = 0;
	    int end = array.length-1;
	    int mid=(end+start)/2;
	    while(end-start>1){
	    	mid = (end+start)/2;
	    	if(array[mid]>=array[start]){
	    		start = mid;
	    	}else{
	    		end = mid;
	    	}	    	
	    }
	    return array[end];
    }
}
