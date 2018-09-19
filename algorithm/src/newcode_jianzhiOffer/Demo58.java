package newcode_jianzhiOffer;
/**
 * ������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���
 * ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ�񣬵��ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ�
 *  ���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18�����ǣ������ܽ��뷽��35,38����
 *  ��Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
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
