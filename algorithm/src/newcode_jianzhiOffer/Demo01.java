package newcode_jianzhiOffer;

import java.util.Arrays;

/*
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class Demo01 {
	public static boolean Find(int target, int [][] array) {
		if(array.length==0)return false;		
		for (int i = array.length-1; i >=0; i--) {
			if(array[i].length!=0 && array[i][0]<=target ){
				for (int j = 0; j < array[i].length; j++) {
					if(array[i][j]==target){
						return true;
					}
				}
			}
		}
		return false;
    }
	
	public static boolean Find2(int target, int [][] array) {
		if(array==null)return false;
		int row = 0;
		int col = array[0].length-1;
		int tmp;
		
		while(row<array.length && col>=0){
			tmp = array[row][col];
			if(tmp==target)return true;
			else if(tmp>target){
				col--;
			}else{
				row++;
			}
			
		}
		return false;
    }
	
	
	
	public static void main(String[] args) {
		int[][] a = {{},{}};
		
		System.err.println(a.length);
		System.out.println(Find(16,a));
	}
}
