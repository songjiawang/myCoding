package DG;
/**
 * �ռ�ƻ��
 * ƽ������N*M�����ӣ�ÿ
 * �������з���һ��������ƻ���������Ͻǵĸ��ӿ�ʼ�� ÿһ��ֻ�������߻��������ߣ�ÿ���ߵ�һ�����ӾͰѸ������ƻ���ռ������� ����һֱ�ߵ����½ǣ���������ռ������ٸ�ƻ����
 * @author purple
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		int [][] n = { {5, 8, 5, 7, 1, 8},
			    {1, 3, 2, 8, 7, 9},
			    {7, 8, 6, 6, 8, 7},
			    {9, 9, 8, 1, 6, 3},
			    {2, 4,10, 2, 6, 2},
			    {5, 5, 2, 1, 8, 8}};
		
		//�ֽ������� ������ֽ�ɸ�С��ͬһ������ 
		//״̬dp[i][j] ��0,0 �ߵ� n[i][j]�����ƻ����
		//״̬ת�Ʒ��̣�dp[i][j] = max{dp[i][j-1],dp[i-1][j]}+n[i][j]; 
		//���ܵ�i,jλ�õ���������������dp����n[i][j]
		int dp[][] = new int[n.length][n[0].length];
		dp[0][0] = n[0][0];//�����½ǵ�dpΪ����
		
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				if(i==0 &&j==0)continue;
				if(i==0){
					dp[i][j] = dp[i][j-1]+n[i][j];
				}else if(j==0){
					dp[i][j] = dp[i-1][j]+n[i][j];
				}else{
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j])+n[i][j];
				}
			}
		}
		System.out.println(dp[5][5]);
	}
}
