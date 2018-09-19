package newcode_jianzhiOffer;

import java.util.Arrays;

/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
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
