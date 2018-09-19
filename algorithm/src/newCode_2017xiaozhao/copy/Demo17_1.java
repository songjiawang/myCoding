package newCode_2017xiaozhao.copy;

import java.util.Scanner;

/**
 * 整数加法
 * @author purple
 *
 */
public class Demo17_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			String str[] = sc.nextLine().split(" ");
			String sum = "";
			try{
			sum = String.valueOf(Integer.valueOf(str[0])+Integer.parseInt(str[1]));
			}catch(Exception e){
				sum = "Error";
			}finally {
				System.out.println(sum);
			}
			 
			
		}
	}
	
	
}
