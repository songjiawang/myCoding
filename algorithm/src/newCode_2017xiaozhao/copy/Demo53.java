package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ²»Òª¶þ
 * @author CQIT
 *
 */
public class Demo53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int w = sc.nextInt();
			int h = sc.nextInt();
			int count=0;
		    boolean[][] flag= new boolean[w][h];
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					if(!flag[i][j]){
						count++;
						if(i+2>=0&&i+2<w){
							flag[i+2][j] = true;
						}
						if(i-2>=0&&i-2<w){
							flag[i-2][j] = true;
						}
						if(j+2>=0&&j+2<h){
							flag[i][j+2] = true;
						}
						if(j-2>=0&&j-2<h){
							flag[i][j-2] = true;
						}
						
					}
				}
			}
			System.out.println(count);
		}
	}
}
