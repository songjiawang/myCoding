package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ×ÖµäÐò
 * @author purple
 *
 */
public class Demo23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			TrieTree head = new TrieTree();
			for (int i = 1; i <= n; i++) {
				insertTree(n, head);
			}
			System.out.println(count(head,m));
		}
	}
	
	private static int count(TrieTree head, int m) {
		// TODO Auto-generated method stub
		if(head==null)return 0;
		
		
		return 0;
	}

	public static void insertTree(int n,TrieTree tree){
		int co;
		char []c = String.valueOf(n).toCharArray();
		for (int i = 0; i < c.length; i++) {
			co = c[i]-'0';
			if(tree.node[co]==null){
				tree.node[co] = new TrieTree();				
			}else{
				tree.node[co].count++;
			}
			tree = tree.node[co];
		}
			
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
}
 class TrieTree{
	int count = 1;
	TrieTree node[] = new TrieTree[10];
}