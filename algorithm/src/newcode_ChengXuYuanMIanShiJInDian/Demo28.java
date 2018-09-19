package newcode_ChengXuYuanMIanShiJInDian;

/**
 * Ä§ÊõË÷Òý2
 */
public class Demo28 {
    public static void main(String[] args) {
    	int [] n = {1,1,3,4,5};
        System.out.println(findMagicIndex(n,5));
    }
    public static boolean findMagicIndex(int[] A, int n) {
        // write code here
       int start = 0;
       int end = n-1;
       int mid;
       
       while(start<end){
    	   mid = (start+end)/2;
    	  
    	   if(A[mid]==mid || A[end]==end || A[start]==start){
    		   return true;
    	   }else{
    		   if(mid<A[mid]){
    			   end = mid;
    		   }else{
    			   start = mid;
    		   }
    	   }
       }
       return false;
    }
}
