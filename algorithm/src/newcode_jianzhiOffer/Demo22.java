package newcode_jianzhiOffer;
/**
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
 * ·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ�
 * ���һ��·�������˾����е�ĳһ�����ӣ����·�������ٽ���ø��ӡ�
 *  ���� a b c e 
 *     s f c s
 *     a d e e �����а���һ���ַ���"bcced"��·�������Ǿ����в�����"abcb"·����
 *  ��Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
 * @author purple
 *
 */
public class Demo22 {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    { boolean []flag = new boolean[rows*cols];
      for (int i = 0; i < rows; i++) 
    	  for (int j = 0; j < cols; j++) {		
    		  if(findPath(i,j,0,flag,str,rows,cols,matrix)){
    			  return true;
    		  }
	   	  }
  
      return false;
    }
	
	public boolean findPath(int i,int j ,int k, boolean []flag ,char[] str ,int rows,int cols,char[] matrix){
		int index = i*cols+j;
		if(i<0 || i>=rows || j<0 ||j>=cols || matrix[index]!=str[k] || flag[index]==true)
			return false;
		if(k==str.length-1)return true;
		flag[index]=true;
		if(findPath(i+1,j,k+1,flag,str,rows,cols,matrix) ||
		   findPath(i-1,j,k+1,flag,str,rows,cols,matrix) ||
		   findPath(i,j+1,k+1,flag,str,rows,cols,matrix) ||
		   findPath(i,j-1,k+1,flag,str,rows,cols,matrix)  )
			return true;
		flag[index]=false;
		return false;
	}

}
