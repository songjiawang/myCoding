package newCodeMuoNiTest;

import java.util.Scanner;
/**
 * ¶ÀÁ¢µÄÅ£Å£
 * @author purple
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int x = sc.nextInt();
			int f = sc.nextInt();
			int d =sc.nextInt();
			int p = sc.nextInt();
			int count = 0;
			boolean flag = true;
			while(flag){
				if(f>0){
					f = f-1;
					d =d-x;
					if(d<0){
						break;
					}else{
						count++;
					}
				}else{
					d = d-p-x;
					if(d>0){
						count++;
					}else{
						break;
					}
					
				}
			}
			System.out.println(count);
		}
		
	}
}
