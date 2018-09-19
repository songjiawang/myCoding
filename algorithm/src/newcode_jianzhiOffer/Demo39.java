package newcode_jianzhiOffer;
/**
 * 
 * @author purple
 *
 */
public class Demo39 {
	public int GetNumberOfK(int [] array , int k) {
	    int count=0;
	    for(int i:array){
	    	if(i==k)count++;
	    }
	    return count;
    }
}
