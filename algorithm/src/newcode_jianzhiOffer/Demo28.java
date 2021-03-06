package newcode_jianzhiOffer;

import java.util.HashSet;
import java.util.Set;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
 * 那么对应的输出是第一个重复的数字2。
 * @author purple
 *
 */
public class Demo28 {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
	    Set<Integer> set = new  HashSet<Integer>();
	    if(length<=0){
	    	duplication[0]=-1;
	    	return false;
	    	
	    }
	    for(int i:numbers){
	    	if(set.contains(i)){
	    		duplication[0]=i;
	    		return true;
	    	}else{
	    		set.add(i);
	    	}
	    }
	    duplication[0]=-1;
		return false;
    }
}
