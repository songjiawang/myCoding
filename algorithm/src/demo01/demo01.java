package demo01;
/**
 * ��֪�����λ�ã�����ĸ����ѹ���ƽ���ı���
 * @author purple
 *
 */
public class demo01 {
	/**
	 * 
	 * @param row
	 * @param cols
	 * @param postion �Ƿ��ž��󣬡�+��Ϊ�������ڵ�λ��
	 * @param x1
	 * @param y1
	 * @return
	 */
	public static int[] find(int row,int cols, char postion[][],int x1,int y1,
			int x2,int y2){
		//���ҳ�����3�˵�λ��
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
