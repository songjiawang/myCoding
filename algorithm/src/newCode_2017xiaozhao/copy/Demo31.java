package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ¼¢¶öÐ¡Ò×
 * @author purple
 *
 */
public class Demo31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong()){
			long n = sc.nextLong();
			long res = find(n);
			System.out.println(res);
			
		}
	}

	public static long find(long n) {
		// TODO Auto-generated method stub
		if(n%1000000007==0){
			return 0;
		}
		
		long temp = n%1000000007;
		int key=0;
		for (int j = 1; j <= 300000; j++) {
			temp = temp*2+1;
			if(temp%1000000007==0){
				key = j;
				break;
			}else{
				temp=temp%1000000007;
			}
		}
		System.out.println(key);
		int count=0;
		if(key==0 || key==1){
			return -1L;
		}else{
			count=key/3;
			if(key%3==0){
				return count;
			}else if(key%3==1){
				return count-1+2;
			}else{
				return count+1;
			}
		}		
	}
}
