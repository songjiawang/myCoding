package DG;
/**
 * Ӳ���������⣨������������
 * @author purple
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		int []size = {1,3,5};
		int sum = 11;
		int []dp = new int[sum+1];
		dp[0] = 0;//״̬dp[i] ;��iԪ��Ҫ��С��Ӳ����
				//״̬ת�Ʒ��̣�dp[i] = min{dp[i-size[j]} s.t. i-size[j]>=0
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = 0; j < size.length; j++) {
				if(i>=size[j] && dp[i]>dp[i-size[j]]+1){
					dp[i] = dp[i-size[j]]+1;
				}
			}
		}
		System.out.println(dp[sum]);
	}
}
