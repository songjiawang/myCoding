package newcode_huawei;

import java.util.Scanner;

/**
 * ºÏ³ªÍÅ
 * @author purple
 *
 */
public class Demo29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num = sc.nextInt();
			int [] s = new int[num];
			for (int i = 0; i < s.length; i++) {
				s[i] = sc.nextInt();
			}
			int []dp1  = new int[num];
			dp1[0] = 1;
			int []dp2  = new int[num];
			dp2[num-1] = 1;
			for (int i = 1; i < dp1.length; i++) {
				dp1[i] = 1;
				for (int j = i-1; j >=0; j--) {
					if(s[j]<s[i]){
						dp1[i] = dp1[j]+1>dp1[i]?dp1[j]+1:dp1[i];
					}
				}
			}
			for (int i = 0; i < dp2.length; i++) {
				System.out.print(dp1[i]+" ");
				
				
			}System.out.print("\n");
			for (int i = num-2; i >=0 ; i--) {
				dp2[i] = 1;
				for (int j = i+1; j <num; j++) {
					if(s[j]<s[i]){
						dp2[i] = dp2[j]+1>dp2[i]?dp2[j]+1:dp2[i];
					}
				}
			}
			for (int i = 0; i < dp2.length; i++) {
				System.out.print(dp2[i]+" ");
				
				
			}System.out.print("\n");
			int max= 0;
			for (int i = 0; i < dp2.length; i++) {
				System.out.print(dp1[i]+dp2[i]+" ");
				max = (dp1[i]+dp2[i])>max?(dp1[i]+dp2[i]):max;
			}
			max = max-1;
			System.out.println(num-max);
			
		}
	}
}
