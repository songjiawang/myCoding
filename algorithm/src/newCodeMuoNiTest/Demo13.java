package newCodeMuoNiTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Å£Å£Å¼ÏñÑø³É¼Ç
 * @author purple
 *
 */
public class Demo13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int t,m;
			int count=0;
			int start = 0;
			Node[]nodes = new Node[n];
			for (int i = 0; i < n; i++) {
				t = sc.nextInt();
				m = sc.nextInt();		
				nodes[i] = new Node(t, m);
			}
			Arrays.sort(nodes);
			for (int i = 0; i < nodes.length; i++) {
				if(nodes[i].start>=start){
					count++;
					start = nodes[i].end;
				}
			}
			System.out.println(count);
			
		}
	}
}
class Node implements Comparable<Node>{
	public int start;
	public int end;
	public int lasted;
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.end<o.end){
			return -1;
		}else if(this.end>o.end){
			return 1;
		}else{
			return 0;
		}
	}
	public Node(int start,int lasted) {
		this.start = start;
		this.lasted = lasted;
		this.end = start+lasted;
		// TODO Auto-generated constructor stub
	}
	
}