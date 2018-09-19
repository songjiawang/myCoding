package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * Òì»ò(Ê¹ÓÃ×ÖµäÊ÷)
 * @author purple
 *
 */
public class Demo25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int array[] = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
			System.out.println(count(array,m));
		}
	}
	
	private static long count(int[] array, int m) {
		// TODO Auto-generated method stub
		TrieTree tree = buildTree(array);
		long result = 0;
		for (int i = 0; i < array.length; i++) {
			result += compare(tree,m,array[i],31);
		}
		
		return result/2;
	}

	private static long compare(TrieTree tree, int m, int n,int j) {
		// TODO Auto-generated method stub
		if(tree==null){return 0;}
		TrieTree temp = tree;
		for (; j >=0; j--) {
			int nDiagitJ = (n>>j)&1;
			int mDiagitJ = (n>>j)&1;
			if(nDiagitJ==1 && mDiagitJ==1){
				if(temp.nodes[0]==null){
					return 0;
				}else{
					temp = temp.nodes[0];
				}
			}else if(nDiagitJ==0 && mDiagitJ==1){
				if(temp.nodes[1]==null){
					return 0;
				}else{
					temp = temp.nodes[1];
				}
			}else if(nDiagitJ==1 && mDiagitJ==0){
				
					long p =  temp.nodes[0]!=null?temp.nodes[0].count:0;
				
					long q = compare(temp.nodes[1],m,n,j-1);
					return q+p;
				
			}else if(nDiagitJ==0 && mDiagitJ==0){
				long q = temp.nodes[1]==null?0:temp.nodes[1].count;
				long p = compare(temp.nodes[0], m, n,j-1);
				return q+p;
			}
		}
		return 0;
	}

	public static TrieTree buildTree(int[] a){
		TrieTree head = new TrieTree();
		for (int i = 0; i < a.length; i++) {
			TrieTree temp = head;
			for (int j = 31; j >=0; j--) {
				int digit = (a[i]>>j)&1;
				if(temp.nodes[digit]==null){
					TrieTree node = new TrieTree();
					node.count = 1;
					temp.nodes[digit]= node;
				}else{
					temp.nodes[digit].count++;
				}
				temp = temp.nodes[digit];
			}
		}
		return head;
	}
	
	
}
class TrieTree{
	int count = 0;
	TrieTree nodes[] = new TrieTree[2];
	
}
