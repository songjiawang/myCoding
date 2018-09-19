package newCodeMuoNiTest;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Å£Å£ÓÎÍæ¼Ç
 * @author purple
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int n = Integer.parseInt(sc.nextLine());
			char[][] ch = new char[n][n];
			LinkedList<Node> list = new LinkedList<Node>();
			Node exit = null;
			int[][] len = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					len[i][j] = -1;
				}
			}
			for (int i = 0; i < n; i++) {
				char[] tmp = sc.nextLine().toCharArray();
				for (int j = 0; j < tmp.length; j++) {
					ch[i][j] = tmp[j];
					if (ch[i][j] == '*') {
						exit = new Node(i, j);
					} else if (ch[i][j] == '@') {
						list.push(new Node(i, j));
						len[i][j] = 0;
					}
				}
			}
			System.out.println(fs(list, ch, exit, len, n));
		}

	}
	public static int fs(LinkedList<Node>list, char[][] ch, Node exit,int dis[][],int n) {
		// TODO Auto-generated method stub
		 int dx[] = {0, 1, 0, -1};
		 int dy[] = {-1, 0, 1, 0};
		while(list.size()!=0){
			Node tmp = list.pop();
			for (int k = 0; k <4; k++) {
				int i = tmp.x+dx[k];
				int j = tmp.y+dy[k];
				if(i>=0 && i<n && j>=0 && j<n && dis[i][j]==-1 && ch[i][j]!='#'){
					Node node = new Node(i,j);
					list.push(node);
					dis[i][j] = dis[tmp.x][tmp.y]+1;
					if(i==exit.x && j==exit.y){
						break;
					}
				}
			}
			if(dis[exit.x][exit.y]!=-1)break;
		}
		return dis[exit.x][exit.y];
	}
}
//class Node{
//	public int x;
//	public int y;
//	public Node() {
//		// TODO Auto-generated constructor stub
//	}
//	public Node(int x,int y){
//		this.x = x;
//		this.y = y;
//	}
//	
//}
