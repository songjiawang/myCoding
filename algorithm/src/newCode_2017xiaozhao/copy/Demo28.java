package newCode_2017xiaozhao.copy;

import java.util.Scanner;
/**
 * ×îÇ¿´óÄÔ
 * @author purple
 *
 */
public class Demo28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String nm = sc.nextLine();
			String one = sc.nextLine();
			String two = sc.nextLine();
			String mn = new StringBuffer(nm).reverse().toString();
	
			boolean f = false;
			boolean b = false;
			int i = nm.indexOf(one);		
			int j = nm.lastIndexOf(two);
			System.out.println(i+" "+j+" ");
			if(i==-1 || j==-1){
				f= false;
			}else{
				if(i+one.length()<=j){
					f = true;
				}else{
					f = false;
				}
			}
			
			i = mn.indexOf(one);
			j = mn.lastIndexOf(two);
			System.out.println(i+" "+j);
			if(i==-1 || j==-1){
				b= false;
			}else{
				if(i+one.length()<=j){
					b = true;
				}else{
					b = false;
				}
			}
			if(f && b){
				System.out.println("both");
			}else if(f){
				System.out.println("forward");
			}else if(b){
				System.out.println("backward");
			}else{
				System.out.println("invalid");
			}
		}
	}
}
