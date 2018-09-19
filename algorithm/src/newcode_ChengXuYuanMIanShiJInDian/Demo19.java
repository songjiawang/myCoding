package newcode_ChengXuYuanMIanShiJInDian;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * ÓÐÏòÂ·¾¶¼ì²â
 * @author purple
 *
 */
public class Demo19 {
	public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        // write code here
		Set<UndirectedGraphNode> set1 = new HashSet();
		Set<UndirectedGraphNode> set2 = new HashSet();
		return checkOnePath(a,b,set1) || checkOnePath(b,a,set2);
    }
	public boolean checkOnePath(UndirectedGraphNode a, UndirectedGraphNode b,Set<UndirectedGraphNode>set) {
        // write code here
		boolean res = false;
		if(a==b){
			return true;
		}
		if(a.neighbors.size()!=0){
			for(UndirectedGraphNode tmp: a.neighbors){
				if(!set.contains(tmp)){
					set.add(tmp);
					res = checkOnePath(tmp,b,set);
					if(res){
						return true;
					}
				}
			}
		}
		return false;
    }
}
class UndirectedGraphNode {
    int label = 0;
    UndirectedGraphNode left = null;
    UndirectedGraphNode right = null;
    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

    public UndirectedGraphNode(int label) {
        this.label = label;
    }
}