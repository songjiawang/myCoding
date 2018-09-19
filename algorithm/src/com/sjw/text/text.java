
package com.sjw.text;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class text {
	public static void main(String[] args) {
		int[] n = {2,2,6};
		List<List<Integer>>list = solution(n,6);
		for(List l:list){
			System.out.println(l);
		}
		
	}
	
	public static List<List<Integer>>solution(int[]integerSet,int targetIngeger){
		List<List<Integer>>res = new LinkedList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();
		for (int i = 0; i < integerSet.length; i++) {
			add(i,integerSet,res,tmp,0,targetIngeger);
		}
		return res;
	}

	private static void add(int i,int[] integerSet, List<List<Integer>> res, List<Integer> tmp, int sum, int targetIngeger) {
		// TODO Auto-generated method stub
		sum = sum+integerSet[i];
		tmp.add(integerSet[i]);
		if(sum==targetIngeger){
			LinkedList<Integer> list = new LinkedList<>();
			for(int t:tmp){
				list.add(t);
			}		
			res.add(list);
		}else if(sum<targetIngeger){
			for (int j = 0; j < integerSet.length; j++) {
				add(j,integerSet,res,tmp,sum,targetIngeger);
			}
		}
		tmp.remove(tmp.size()-1);
	}
}
