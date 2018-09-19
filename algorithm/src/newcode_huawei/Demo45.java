package newcode_huawei;
/**
 * ÏßÐÔ²åÖµ
 */
import java.util.Scanner;

public class Demo45 {
	public static void main(String[] args) {
		°¡Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int i = m;		
			int []date = new int[n-m+1];			
			while(i-->0){					
				date[0] = sc.nextInt();
				date[date.length-1] = sc.nextInt();
				int t = n-m-1;
				if(t==0){
					print(date);
				}else{
					insertDate(date,n-m);
					print(date);
				}
				
			}
		}
	}
	static void print(int[] s){
		for (int i = 0; i < s.length; i++) {
			if(i==s.length-1)System.out.print(s[i]);
			else{
				System.out.print(s[i]+" ");
			}
		}
	}
	static void insertDate(int []s,int t){
		for (int i = 1; i < s.length-1; i++) {
			s[i] = s[0]+((s[s.length-1]-s[0])/t)*(i);
		}
	}
}