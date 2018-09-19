package newcode_jianzhiOffer;
/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 *  例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
 *  因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 * @author purple
 *
 */
public class Demo58 {
	public int movingCount(int threshold, int rows, int cols){
		boolean [][] flag  = new boolean [rows][cols];
		return count(threshold,0,0,rows,cols,flag);
    }
	public int count(int threshold,int x, int y,int rows, int cols,boolean [][]flag){
		int count = 0;
		if(x<0 || x>=rows || y<0 || y>=cols || flag[x][y] || !canIn(threshold,x,y)){
			return 0;
		}else{
			flag[x][y] = true;
			return 1+count(threshold,x+1,y,rows,cols,flag)+
			count(threshold,x,y+1,rows,cols,flag)+
			count(threshold,x-1,y,rows,cols,flag)+
			count(threshold,x,y-1,rows,cols,flag);
			
		}
	}
	boolean canIn(int threshold,int x, int y){
		return (sum(x)+sum(y))<=threshold?true:false;
		
	}
	int sum(int x){
		if(x<10){
			return x;
		}else{
			return x%10+(sum(x/10));
		}
		
	}
}
