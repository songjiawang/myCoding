package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.SortingFocusTraversalPolicy;


/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
 * 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 * 那么中位数就是所有数值排序之后中间两个数的平均值。
 * @author purple
 *
 */
public class Demo24 {
	ArrayList<Integer> list = new ArrayList<Integer>();
	public void Insert(Integer num) {
	    list.add(num);
	    for (int i = 0; i < list.size()-1; i++) {
			if(list.get(i)>num){
				for (int j = list.size()-2; j >=i; j--) {
					list.set(j+1, list.get(j));
				}
				list.set(i, num);
				break;
			}
		}
	    
    }

    public Double GetMedian() {
        if(list.size()%2==0){
        	return  (list.get(list.size()/2)+list.get((list.size()/2)-1))/2.0;
        }else{
        	return (double)list.get(list.size()/2);
        }
    }
}
