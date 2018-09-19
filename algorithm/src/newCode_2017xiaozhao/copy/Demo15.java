package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * ¾Æµê¼Û¸ñ
 * @author purple
 *
 */
public class Demo15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int[]tmp = new int[3000];
			int max = 0;
			int min = 3000;
			String res = "";
			String s = "";
			while(sc.hasNextInt()){
				int start = sc.nextInt();
				int end = sc.nextInt();
				int prize = sc.nextInt();
				min = Math.min(min, start);
				max = Math.max(max, end);
				for (int i = start; i <= end; i++) {
					tmp[i] = prize;
				}
			}
			//System.out.println("end");
			int startIndex = min;
			int endIndex = min;
			for (int i = min; i <= max;) {		
				if(tmp[i]!=0){
					startIndex = i;
					endIndex = i;
					while(i<=max){
						if(tmp[i]==tmp[startIndex]){
							endIndex = i;
							if(i==max){
								s = "["+startIndex+","+" "+endIndex+","+" "+tmp[startIndex]+"]";
								if(res.length()==0){
									res = res+s;
								}else{
									res = res+","+s;
								}
								
								
							}
							i++;
							
						}else{
							s = "["+startIndex+","+" "+endIndex+","+" "+tmp[startIndex]+"]";
							System.out.println(s);
							if(res.length()==0){
								res = res+s;
							}else{
								res = res+","+s;
							}
							break;
						}
					}
					
				}else{
					i++;
				}
				
			}
			System.out.println(res);
		}
	}
}
