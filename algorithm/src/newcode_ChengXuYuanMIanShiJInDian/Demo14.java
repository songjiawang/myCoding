package newcode_ChengXuYuanMIanShiJInDian;

import java.util.ArrayList;

/**
 * ºØ∫œ’æ
 * @author purple
 *
 */
public class Demo14 {

	public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
		ArrayList<ArrayList<Integer>> setOfStacks = new ArrayList<>();
		for (int i = 0; i < ope.length; i++) {
			if(ope[i][0]==1)push(setOfStacks,ope[i][1],size);
			else{
				pop(setOfStacks);
			}
		}
		return setOfStacks;
    }
	public void push(ArrayList<ArrayList<Integer>> setOfStacks,int val,int size){
		if(setOfStacks.size()!=0 ||setOfStacks.get(setOfStacks.size()-1).size()<size){
			setOfStacks.get(setOfStacks.size()-1).add(val);
		}else{
			ArrayList<Integer> tmp = new ArrayList<>();
			tmp.add(val);
			setOfStacks.add(tmp);
		}
	}
	
	public void pop(ArrayList<ArrayList<Integer>> setOfStacks){
		if(setOfStacks.size()==0)return;
		if(setOfStacks.get(setOfStacks.size()-1).size()>1){
			setOfStacks.get(setOfStacks.size()-1).remove(setOfStacks.get(setOfStacks.size()-1).size()-1);
		}else{	
			setOfStacks.remove(setOfStacks.size()-1);
		}
	}
}
