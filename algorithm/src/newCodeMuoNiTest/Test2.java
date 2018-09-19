package newCodeMuoNiTest;

import java.util.Scanner;
/**
 * Å£Å£³ÔÑ©¸â
 * @author purple
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int t = sc.nextInt();
			while(t-->0){
				int n = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				boolean res = true;
				if((n-1)*6>a+b*2+c*3)res = false;
				if(res)res = panduan2(n+1,a,b,c);
				
				if(res){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
				
			}
		}

	}		
	public static boolean panduan2(int n,int a,int b,int c){
		if(n<a+b*2+c*3)return false;
		if(n<=0)return true;
		
		if(a<0 || b<0 ||c<0){
			return false;
		}
		
		return  panduan2(n-1,a-4,b-1,c)||
				panduan2(n-1,a-3,b,c-1)||
				panduan2(n-1,a,b-3,c)||
				panduan2(n-1,a-2,b-2,c)||
				panduan2(n-1,a-1,b-1,c-1)||
				panduan2(n-1,a-6,b,c)||
				panduan2(n-1,a,b,c-2);
		
	}
}
