package newcode_ChengXuYuanMIanShiJInDian;
/**
 * Çå³ýÐÐÁÐ
 * @author purple
 *
 */
public class Demo07 {
	public int[][] clearZero(int[][] mat, int n) {
        // write code here
		boolean[]zeroRows = new boolean[mat.length];
		boolean[]zeroCols = new boolean[mat[0].length];
		for (int i = 0; i < zeroRows.length; i++) {
			for (int j = 0; j < zeroCols.length; j++) {
				if(mat[i][j]==0){
					zeroRows[i] = true;
					zeroCols[j] = true;
				}
			}
		}
		for (int i = 0; i < zeroRows.length; i++) {
			if(zeroRows[i]){
				for (int j = 0; j < zeroCols.length; j++) {
					mat[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < zeroCols.length; i++) {
			if(zeroCols[i]){
				for (int j = 0; j < zeroRows.length; j++) {
					mat[j][i] = 0;
				}
			}
		}
		return mat;
		
    }
}
