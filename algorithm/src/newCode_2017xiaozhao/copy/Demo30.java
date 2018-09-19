package newCode_2017xiaozhao.copy;
import java.util.Arrays;
/**
 * ½â¾ÈÐ¡Ò×
 */
import java.util.Scanner;

public class Demo30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			//int[][]array = new int[1000][1000];
			int[]x = new int[n];
			int[]y = new int[n];
			for (int i = 0; i < n; i++) {
				x[i]= sc.nextInt()-1;
			}
			for (int i = 0; i < n; i++) {
				y[i]= sc.nextInt()-1;
			}
			int[]len = new int[n];
			for (int i = 0; i < n; i++) {
				len[i] = x[i]+y[i];
			}
			Arrays.sort(len);
			System.out.println(len[0]);
		}
	}
}
