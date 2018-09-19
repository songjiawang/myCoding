package newcode_jianzhiOffer;
/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 * @author purple
 *
 */
public class Demo61 {
	public static int InversePairs(int [] array) {
        int sum = 0;
        int start = 0;  
        int end  = array.length-1;
        if(array.length<2)return -1;
        return sumIP(array,start,end)%1000000007;
        
    }
	public static int sumIP(int [] array,int start,int end){
		int sum = 0;
		if(start<end){
			
				for (int i = start+1; i<=end; i++) {
					if(array[i]<array[start])sum++;
				}
				return sum+sumIP(array,start+1,end);
			
			
		}else{
			return 0;
		}
		
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,0};
		System.out.println(InversePairs(array));
	}
}
