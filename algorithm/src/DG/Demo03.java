package DG;
/**
 * ����������:����һ�����������Σ��ҵ��Ӷ������ײ�����С·���͡�ÿһ�������ƶ�������һ�е����������ϻ�����һ�е��Ҳ�
 * @author purple
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		int[][] n = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		int dp[][] = new int[101][101];
		//״̬d[i][j] �ӵ�i�еھ��е�Ԫ�ص����һ�е���С·����
		//״̬ת�Ʒ��̣�d[i][j] = min{d[i+1][j],d[i+1][j+1]}+n[i][j] �ҵ�ǰ�������һ�е���Сֵ�������ܵ�����һ�е�����λ���е���
		//���һ�е���Сֵ+n[i][j]
		dp[n.length-1][0] = 0;
		for (int i = n.length-1; i >=0; i--) {
			for (int j = 0; j < n[i].length; j++) {
				dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1])+n[i][j];			
			}
		}
		System.out.println(dp[0][0]);
	}
}
