package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ÂòÆ»¹û
 * @author CQIT
 *
 */
public class Demo46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			
			int p = n/8;
			int co = n%8;
			if(co==0){
				System.out.println(p);
			}else{
				if(co%2!=0){
					System.out.println(-1);
				}else if(co==2){
					if(p>2){
						p = p-2+3;
						System.out.println(p);
					}else{
						System.out.println(-1);
					}				
				}else if(co==4){
					if(p>1){
						p = p-1+2;
						System.out.println(p);
					}else{
						System.out.println(-1);
					}
				}else if(co==6){
					System.out.println(p+1);
				}
			}
		}
	}
}
