package newcode_ChengXuYuanMIanShiJInDian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 集合的子集
 * @author purple
 *
 */
public class Demo30 {
	public static void main(String[] args) {
		int[]n = {123,456,789};
		System.out.println(getSubsets(n,3));
	}
	public static ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		LinkedList<ArrayList<Integer>>list = new LinkedList<>();
		//lopklkjoijopijopiiouoiml;kmoinjnik.mojio List<Integer> one = new ArrayList<>();
		one = Arrays.asList(A);
		for (int i = n-1; i >=0; i--) {
			one.add(A[i]);
		}
		list.add(one);
		ArrayList<Integer> temp = null;
		while(!list.isEmpty()){
			temp = list.pop();
			if(temp.size()==2){
				res.add(temp);
				continue;
			}
			for (int i = temp.size()-1; i >=0 ; i--) {
				ArrayList<Integer> node = new ArrayList<>();
				node.addAll(temp);
				node.remove(i);
				list.add(node);
			}
			res.add(temp);
		}
		for (int i = n-1; i >=0; i--) {
			ArrayList<Integer> node = new ArrayList<>();
			node.add(A[i]);
			res.add(node);
		}
		return res;
    }
}
