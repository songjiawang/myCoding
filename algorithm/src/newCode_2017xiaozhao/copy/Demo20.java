package newCode_2017xiaozhao.copy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 丢失的三个数
 * @author purple
 *
 */
public class Demo20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int n = 9997;
			int i = 0;
			int [] num = new int[n];
			while(n-->0){
				num[i] = sc.nextInt();
				i++;
			}
			Arrays.sort(num);
			i=0;
			Integer[]res = new Integer[3];
			for (int j = 1; j < num.length; j++) {
				if(num[j]-num[j-1]==2){
					res[i] = num[j]+1;
					i++;
				}else if(num[j]-num[j-1]==3){
					res[i] = num[j]+1;
					res[i+1] = num[j]+2;
					i = i+2;
				}else if(num[j]-num[j-1]==4){
					res[i] = num[j]+1;
					res[i+1] = num[j]+2;
					res[i+3] = num[j]+2;
					break;
				}
			}
			
			Arrays.sort(res);
			Long l = Long.parseLong(String.valueOf(res[0])+String.valueOf(res[1])+String.valueOf(res[2]));
			System.out.println(l%7);
			
		}
	}
}
