package mianjing;
/**
 * ÖÐÐË2018javaÃæÊÔ
 * @author CQIT
 *
 */
public class Demo01 {
	
	private static int maxScource(int numNodes,int rootNode,int[]values,int[][]edges){
		
		int[]max = new int[1];
		max[0]=Integer.MIN_VALUE;
		find(rootNode,values,edges,max,1);
		return max[0];
		
	}
	
	private static void find(int currentNode,int[]values,int[][]edges,int[] max,int sum){
		sum = sum*values[currentNode-1];
		//System.out.println(sum);
		//max[0] = max[0]>sum?max[0]:sum;
		boolean exit = false;
		for (int i = 0; i < edges.length; i++) {
			if(edges[i][0]==currentNode){
				exit = true;
				find(edges[i][1],values,edges,max,sum);
			}
		}
		if(!exit){
		  max[0] = max[0]>sum?max[0]:sum;
		}
		
	}
	public static void main(String[] args) {
		int numNodes = 5;
		int rootNode = 1;
		int[]values = {2,4,10,20,1};
		int[][] edges = {{1,2},{1,3},{2,4},{2,5}};
		System.out.println(maxScource(numNodes, rootNode, values, edges));
	}
}
