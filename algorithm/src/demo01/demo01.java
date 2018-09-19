package demo01;
/**
 * 已知三点的位置，求第四个点已构成平行四边形
 * @author purple
 *
 */
public class demo01 {
	/**
	 * 
	 * @param row
	 * @param cols
	 * @param postion 是符号矩阵，“+”为四人所在的位置
	 * @param x1
	 * @param y1
	 * @return
	 */
	public static int[] find(int row,int cols, char postion[][],int x1,int y1,
			int x2,int y2){
		//先找出出第3人的位置
		int x3=0,y3=0;
		int[]xy4 = new int[2];
		for(int i=0;i<row;i++)
			for(int j=0;j<cols;j++){
				if(postion[i][j]=='+'){
					if((i+1==x1&&j+1==y1)||(i+1==x2&&j+1==y2)){						
					}else{
						x3=i;
						y3=j;
						break;
					}
				}			
			}
		int midleX=(x1+x2)/2;
		int midleY=(y1+y2)/2;
		
		int x4=2*midleX-x3;
		int y4=2*midleY-y3;
		
		xy4[0]=x4;
		xy4[1]=y4;		
		return xy4;
		
		
		
		return xy4;
	}
	
}
