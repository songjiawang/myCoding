package newCodeMuoNiTest;

import java.util.Scanner;
/**
 * Å£Å£³ÔÑ©¸â
 * @author purple
 *
 */
public class Test2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int t = sc.nextInt();
			while(t-->0){
				int n = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				n = n-c/2;
				n  = n-b/3;
				c= c%2;
				b = b%3;
				
				if(c==1 && b>=1 && a>=1){
					n--;
					a--;
					b--;
					c--;
				}
				if(c==1 && a>=3){
					n--;
					a=a-3;
					c--;
				}
				if(b==2 && a>=2){
					n--;
					a=a-2;
					b--;
				}
				if(b==1 && a>=4){
					n--;
					a=a-4;
					b--;
				}
				n = n-a/6;
				if(n>0){
					System.out.println("No");
				}else{
					System.out.println("Yes");
				}
				
			}
		}

	}		
	
}
