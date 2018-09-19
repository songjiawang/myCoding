package newcode_huawei;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * √‘π¨Œ Ã‚
 * @author purple
 *
 */
public class Demo43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int rol = sc.nextInt();
			int cow = sc.nextInt();
			int[][]maze = new int[rol][cow];
			for (int i = 0; i < rol; i++) {
				for (int j = 0; j < cow; j++) {
					maze[i][j] = sc.nextInt();
				}
			}	
			LinkedList<LinkedList<String>> resList = new LinkedList<>();
			LinkedList<String>list =  new LinkedList<>();
			onePeace(maze,0,0,list,resList);
			LinkedList<String>minList =  resList.peek();
			for(LinkedList<String> l :resList){
				if(l.size()<minList.size())minList = l;
			}
			System.out.println(resList);
			for(String str:minList){
				System.out.println(str);
			}
		
		}
	}
	static void onePeace(int maze[][],int i ,int j,LinkedList<String> list,LinkedList<LinkedList<String>> resList ){
		if(i==maze.length-1 && j==maze[0].length-1){
			list.add("("+i+","+j+")");
			LinkedList<String>tmp = new LinkedList();
			tmp.addAll(list);
			resList.add(tmp);
			return;
		}else{
			list.add("("+i+","+j+")");
			maze[i][j]=1;
			
		}
		if(!(i+1<0 || i+1>maze.length-1 ||j<0 || j>maze[0].length-1 ||maze[i+1][j]==1 )){
			onePeace(maze,i+1,j,list,resList);
			maze[i+1][j]= 0;
			list.removeLast();			
			}
		if(!(i-1<0 || i-1>maze.length-1 ||j<0 || j>maze[0].length-1 ||maze[i-1][j]==1 )){
			onePeace(maze,i-1,j,list,resList);
			maze[i-1][j]= 0;
			list.removeLast();			
			}
		if(!(i<0 || i>maze.length-1 ||j+1<0 || j+1>maze[0].length-1 ||maze[i][j+1]==1) ){
			onePeace(maze,i,j+1,list,resList);
			maze[i][j+1]= 0;
			list.removeLast();			
			}
		if(!(i<0 || i>maze.length-1 ||j-1<0 || j-1>maze[0].length-1 ||maze[i][j-1]==1 )){
			onePeace(maze,i,j-1,list,resList);
			maze[i][j-1]= 0;
			list.removeLast();			
			}
		
		
	}
}
