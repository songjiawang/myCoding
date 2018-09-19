package newcode_ChengXuYuanMIanShiJInDian;
/**
 * ÏñËØ·­×ª
 * @author purple
 *
 */
public class Demo06 {
	public int[][] transformImage(int[][] mat, int n) {
        // write code here
		int i = 0;
		int startJ = 0;
		int endJ = n-1;
		//while(startJ<endJ){
			turnOneCircle(mat,n,i,startJ,endJ);
			i = i+1;
			startJ = startJ+1;
			endJ = endJ-1;
		//}
		return mat;
    }
	public void turnOneCircle(int[][]mat,int n,int i,int startJ, int endJ){
		for (int j = startJ; j <= endJ-1; j++) {
			int tmp = mat[i][j] ;
			int tmpi = i,tmpj =j;
			mat[tmpi][tmpj] = mat[n-tmpj-1][tmpi];
			int temp = tmpi;
			tmpi =n-tmpj-1;
			tmpj = temp;			
			mat[tmpi][tmpj] = mat[n-tmpj-1][tmpi];
			 temp = tmpi;
			tmpi =n-tmpj-1;
			tmpj = temp;		
			mat[tmpi][tmpj] = mat[n-tmpj-1][tmpi];
			temp = tmpi;
			tmpi =n-tmpj-1;
			tmpj = temp;		
			mat[tmpi][tmpj] = tmp;
			
		    
		}
	}
}
